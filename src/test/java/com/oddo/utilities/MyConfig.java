package com.oddo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyConfig {
    private static Properties properties;


    static {
        String path = "config.properties";

        try {
            FileInputStream file = new FileInputStream(path); // reads file
            properties = new Properties();
            properties.load(file);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     public static String getProperty(String key){
        return properties.getProperty(key);


     }
}
