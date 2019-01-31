package com.oddo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyConfig {
    private static Properties properties;


    static {

        try {

            String path = "config.properties";

            FileInputStream file = new FileInputStream(path); // reads file
            properties = new Properties();
            properties.load(file);

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     public static String getProperty(String key){
        return properties.getProperty(key);


     }
}
