package com.balsam.objectmaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.balsam.utilities.WebDriverManager;

public class HomeObjects {

    WebDriver driver = WebDriverManager.getDriver();

    public static final By SEARCH_FIELD = By.id("constructor-search-input");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.xpath("//button[@id='login']");
    public static final By SUBMIT_BUTTON = By.name("submit");
    public static final By BANNER_IMAGE = By.xpath("//img[contains(@src, 'balsamhilllogo.png')]");

    public WebElement searchField = driver.findElement(By.xpath("//input[@id='constructor-search-input']"));
    public WebElement bannerImage = driver.findElement(By.xpath("//img[contains(@src, 'balsamhilllogo.png')]"));
    public WebElement closeFooterBannerBtn = driver.findElement(By.xpath("//button[@data-testid='close-cookie-banner']"));

    // public WebElement findElement(By locator) {
    //     return driver.findElement(locator);
    // }

    // public void inputText(By locator, String text) {
    //     findElement(locator).clear();
    //     findElement(locator).sendKeys(text);
    // }


}
