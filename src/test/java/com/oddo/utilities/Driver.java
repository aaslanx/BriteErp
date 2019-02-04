package com.oddo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Driver {

    private Driver() {

    }

    private static WebDriver driver;  //we only use it once

    public static WebDriver getDriver() {


        if (driver == null) {
            String s = MyConfig.getProperty("browser");
            if ("chrome".equals(s)) {
                WebDriverManager.chromedriver().setup();

            } else if ("firefox".equals(s)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            }
        }
        return driver;

    }
}
