package com.balsam.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.balsam.objectmaps.ResultsObjects;
import com.balsam.utilities.SimpleLogger;
import com.balsam.utilities.WebDriverManager;

public class ResultsPage {

    WebDriver driver = WebDriverManager.getDriver();
    
    public void selectProduct(int orderResult){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        SimpleLogger.info((driver.getCurrentUrl()));
        
        // Wait until the new page has fully loaded
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
            webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete")
        );
        SimpleLogger.info("Successfully loaded new page");

        try {
            // Verify initial results page
            Thread.sleep(2500);
            SimpleLogger.info((driver.getCurrentUrl()));
            ResultsObjects resultsObjects = new ResultsObjects();
            
            wait.until(ExpectedConditions.visibilityOf(resultsObjects.productsHeader));
            SimpleLogger.info("Successfully navigated to Balsam Hill results page");
            
            // Select the third option from the search result
            WebElement imageResult = driver.findElement(By.xpath("(" + resultsObjects.gridDiv + "//following::img[@alt='Add to favorites'])[" + orderResult + "]//preceding::img[1]"));
            imageResult.click();
            Thread.sleep(2500);

        } catch (InterruptedException e) {
            SimpleLogger.info(e.getMessage());
        }
        
    }

}
