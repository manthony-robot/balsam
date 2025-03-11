package com.balsam;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.balsam.objectmaps.HomeObjects;
import com.balsam.utilities.SimpleLogger;
import com.balsam.utilities.WebDriverManager;

public class App {

    WebDriver driver = WebDriverManager.getDriver();

    public void setup(){
        // Specify which chromedriver to use
        // System.setProperty("webdriver.chrome.driver", "Balsam/preassessment/chromedriver.exe");
        
        SimpleLogger.info("Initializing browser");
        // driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://www.balsamhill.com/");
    }

    public void teardown(){
        driver.close();
        driver.quit();
        SimpleLogger.info("Quitting browser");
    }

    public void openSite(){
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
                wait.until(ExpectedConditions.invisibilityOf(homeObjects.closeFooterBannerBtn)).wait(5000);
                SimpleLogger.info("Footer banner is closed");
            }

            // Verify search box
            wait.until(ExpectedConditions.visibilityOf(homeObjects.searchField));
            homeObjects.searchField.sendKeys("Christmas Tree");
            homeObjects.searchField.click();
            SimpleLogger.info("Search for Christmas Tree");
            
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        App sc = new App();
        sc.setup();
        sc.openSite();
        sc.teardown();
    }
}