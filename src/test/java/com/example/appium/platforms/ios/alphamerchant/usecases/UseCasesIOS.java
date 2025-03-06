package com.example.appium.platforms.ios.alphamerchant.usecases;

import com.example.appium.platforms.interfaces.UseCases;
import com.example.appium.platforms.ios.alphamerchant.usecases.selectors.UseCaseSelector;
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
                        UseCaseSelector.shopOnWebCheckoutElement
                )
        );
        shopOnWebCheckout.click();
    }
}
