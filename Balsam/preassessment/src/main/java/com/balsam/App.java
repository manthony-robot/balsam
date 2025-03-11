package com.balsam;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.balsam.Objects.HomeObjects;

public class App {

    private static final Logger log = LogManager.getLogger(App.class);
    WebDriver driver;

    public void setup(){
        // WebDriverManager.chromedriver()setup();
        System.setProperty("webdriver.chrome.driver", "Balsam/preassessment/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.get("https://www.balsamhill.com/");
        
    }

    public void teardown(){
        driver.close();
        driver.quit();
        log.info("Quitting browser");
    }

    public void openSite(){
        try{
            HomeObjects home = new HomeObjects();
            Thread.sleep(5000);  // Let the user actually see something!
            WebElement searchBox = driver.findElement(home.SEARCH_FIELD);

            searchBox.sendKeys("Christmas Tree");
            searchBox.click();
            System.out.println("Search for Christmas Tree");
            log.info("Quitting browser");
            Thread.sleep(5000);  // Let the user actually see something!
            
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
