package com.jzx.fruit.api.factory;

import com.example.api.service.WatermelonService;
import com.jzx.fruit.api.config.Config;
import com.jzx.fruit.api.exception.NoSpiChooseException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * @program: fruit
 * @description:
 * @author: jzx
 * @create: 2020-11-02 10:22
 **/
public class WaterMeloFactory<T> implements FactoryBean<T> {

    private Class<? extends WatermelonService> wspiClz;

    private List<WatermelonService> list;

    private ApplicationContext applicationContext;

    public WaterMeloFactory(ApplicationContext applicationContext, Class<? extends WatermelonService> wspiClz) {
        this.applicationContext = applicationContext;
        this.wspiClz = wspiClz;

        Map<String, ? extends WatermelonService> map = applicationContext.getBeansOfType(wspiClz);
        list = new ArrayList<>(map.values());
        list.sort(Comparator.comparingInt(WatermelonService::order));
        this.list = list;
    }

    @Override
    public T getObject() throws Exception {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                for (WatermelonService spi : list) {
                    if (spi.verify(Config.VERSION)) {
                        // 第一个参数作为条件选择
                        return method.invoke(spi, args);
                    }
                }
                throw new NoSpiChooseException("no spi server can execute! spiList: " + list);
            }
        };
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{wspiClz},
                invocationHandler);
    }

    @Override
    public Class<?> getObjectType() {
        return wspiClz;
    }
}
