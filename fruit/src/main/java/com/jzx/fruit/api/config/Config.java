/*
 *  Copyright 2019-2020 Zheng Jie
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.jzx.fruit.api.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
  * @program: ServerUrlUtil
  * @description: ServerUrlUtil 请求url工具类
  * @author: jzx
  * @create: 2020-08-07 17:40
**/
public class Config {

    public static String VERSION;

    static{
        Properties props = new Properties();
        InputStream in = null;
        try {
            in = Config.class.getResourceAsStream(File.separator+ "config.properties");
            props.load(new InputStreamReader(in,"UTF-8"));
            VERSION = props.getProperty("version");
        } catch (Exception e) {
        }finally {
            if(null != in){
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
    }



}
