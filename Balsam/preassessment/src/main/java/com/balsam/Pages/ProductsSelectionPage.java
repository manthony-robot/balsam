package com.balsam.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.balsam.objectmaps.ProductSelectionObjects;
import com.balsam.utilities.SimpleLogger;
import com.balsam.utilities.WebDriverManager;

public class ProductsSelectionPage {

    WebDriver driver = WebDriverManager.getDriver();

    public void addAnItemToCart(){
        ProductSelectionObjects prodSelectObjects = new ProductSelectionObjects();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            Thread.sleep(2500);
            // Verify Product Selection page
            wait.until(ExpectedConditions.visibilityOf(prodSelectObjects.addToCartButton));
            SimpleLogger.info("Successfully navigated to Balsam Product Selection page");
            prodSelectObjects.addToCartButton.click();

            // Verify dialog contents
            wait.until(ExpectedConditions.visibilityOf(prodSelectObjects.viewCartButton));
            wait.until(ExpectedConditions.visibilityOf(prodSelectObjects.productDesc));
            SimpleLogger.info("Product Description: " + prodSelectObjects.productDesc.getText());
            Thread.sleep(2500);
            
            // Click on View Cart button
            prodSelectObjects.viewCartButton.click();
            SimpleLogger.info("Successfully added an item to the cart");

        } catch (InterruptedException e) {
            SimpleLogger.info(e.getMessage());
        }
        
    }
}
