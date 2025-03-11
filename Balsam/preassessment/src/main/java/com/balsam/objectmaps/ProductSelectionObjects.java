package com.balsam.objectmaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.balsam.utilities.WebDriverManager;

public class ProductSelectionObjects {

    WebDriver driver = WebDriverManager.getDriver();

    public WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-testid='pdc-btn-addtocart']"));
    
    // Dialog elements
    public WebElement viewCartButton = driver.findElement(By.xpath("button[text()=View Cart]"));
    public WebElement productDesc = driver.findElement(By.xpath("div[contains(@class, 'productAddToCartModal_title')]"));
    

}