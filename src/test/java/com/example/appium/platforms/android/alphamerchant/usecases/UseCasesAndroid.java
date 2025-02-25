package com.example.appium.platforms.android.alphamerchant.usecases;

import com.example.appium.platforms.android.alphamerchant.shopon.selectors.ShopOnSelectors;
import com.example.appium.platforms.android.alphamerchant.usecases.selectors.UseCasesSelector;
import com.example.appium.platforms.interfaces.UseCases;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseCasesAndroid implements UseCases {
    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public UseCasesAndroid (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Override
    public void selectAndClickShopOnWebCheckout() {
        WebElement shopOnWebCheckout = wait.until(
                ExpectedConditions.elementToBeClickable(
                        UseCasesSelector.shopOnWebCheckout
                )
        );
        shopOnWebCheckout.click();
    }
}
