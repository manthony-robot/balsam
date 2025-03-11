package com.balsam.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.balsam.constants.Constants;

public class BrowserActions {

    WebDriver driver = WebDriverManager.getDriver();

    public void setup(){
        // Initialize chromedriver
        SimpleLogger.info("Initializing browser");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get(Constants.URL);
    }

    public void teardown(){
        SimpleLogger.info("Quitting browser");
        driver.close();
        driver.quit();
    }
}
