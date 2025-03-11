package com.balsam.objectmaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.balsam.utilities.WebDriverManager;

public class ResultsObjects {

    WebDriver driver = WebDriverManager.getDriver();

    public String gridDiv = "//div[contains(@class, 'page-content')]";

    // public WebElement searchResultHeader = driver.findElement(By.xpath("//div[@data-testid='search-result-header']"));
    // public WebElement imageResult = driver.findElement(By.xpath("//img"));
    // public WebElement resultSpan = driver.findElement(By.xpath(d"//h2"));
    public WebElement productsHeader = driver.findElement(By.xpath(gridDiv));

}
