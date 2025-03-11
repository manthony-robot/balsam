package com.balsam.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.balsam.objectmaps.HomeObjects;
import com.balsam.utilities.SimpleLogger;
import com.balsam.utilities.WebDriverManager;

public class HomePage {

    WebDriver driver = WebDriverManager.getDriver();

    public void performSearch(String text){
        try{
            HomeObjects homeObjects = new HomeObjects();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Verify initial page
            wait.until(ExpectedConditions.visibilityOf(homeObjects.bannerImage));
            SimpleLogger.info("Successfully navigated to Balsam Hill homepage");
            
            // Close the cookie banner
            if(!homeObjects.closeFooterBannerBtn.isDisplayed()){
                SimpleLogger.info("Footer banner is not visible");
            }
            else{
                wait.until(ExpectedConditions.visibilityOf(homeObjects.closeFooterBannerBtn));
                SimpleLogger.info("Footer banner is visible");
                homeObjects.closeFooterBannerBtn.click();
                wait.until(ExpectedConditions.invisibilityOf(homeObjects.closeFooterBannerBtn));
                SimpleLogger.info("Footer banner is closed");
            }
            
            // Verify and populate search box
            wait.until(ExpectedConditions.visibilityOf(homeObjects.searchField));
            homeObjects.searchField.click();
            homeObjects.searchField.sendKeys("Christmas Tree");
            SimpleLogger.info("Search for Christmas Tree");
            homeObjects.searchField.sendKeys(Keys.ENTER);
            wait.until(ExpectedConditions.textToBePresentInElementValue(homeObjects.searchField, ""));

        } catch (NoSuchElementException e){
            System.out.println("No Such Element Exception: " + e);
        } catch (Exception e){
            System.out.println("Error: " + e);
        } 
    }
}
