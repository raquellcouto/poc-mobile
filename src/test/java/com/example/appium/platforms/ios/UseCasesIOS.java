package com.example.appium.platforms.ios;

import com.example.appium.platforms.UseCases;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseCasesIOS implements UseCases {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public UseCasesIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectAndClickShopOnWebCheckout(){
        WebElement shopOnWebCheckout = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//XCUIElementTypeButton[@name=\"Shop.On (web checkout), Payment, eCommerce\"]")
                )
        );
        shopOnWebCheckout.click();
    }
}
