package com.oddo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {


    private static WebDriver driver;  //we only use it once

    public static WebDriver getDriver() {


        if (driver == null) {
            switch (MyConfig.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    break;
            }
        }
        return driver;

//
//        WebDriverManager.chromedriver().setup();
//        return driver;
    }
        public static void closeDriver(){
        if(driver!=null);
        driver.close();
        }
}
