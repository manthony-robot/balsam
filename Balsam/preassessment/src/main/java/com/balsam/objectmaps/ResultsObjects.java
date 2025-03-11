package com.balsam.objectmaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.balsam.utilities.WebDriverManager;

public class ResultsObjects {

    WebDriver driver = WebDriverManager.getDriver();

    public String gridDiv = "//div[contains(@class, 'page-content')]";
    
    public WebElement productsHeader = driver.findElement(By.xpath(gridDiv));

}
