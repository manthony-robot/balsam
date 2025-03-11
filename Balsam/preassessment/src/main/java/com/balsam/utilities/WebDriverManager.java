package com.balsam.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.balsam.constants.Constants;

// This class is the unified source for webdriver across classes
public class WebDriverManager {
    
    private static WebDriver driver;

    // Private constructor to prevent direct instantiation
    private WebDriverManager() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(Constants.CHROME_DRIVER_KEY, Constants.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
