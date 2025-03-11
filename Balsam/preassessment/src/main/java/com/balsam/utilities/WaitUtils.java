package com.balsam.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    WebDriver driver = WebDriverManager.getDriver();

    public static void waitUntilElementIsVisible(WebElement element, int timeoutInSeconds) {
        WaitUtils waitObj = new WaitUtils();
    
        WebDriverWait wait = new WebDriverWait(waitObj.driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    
}
