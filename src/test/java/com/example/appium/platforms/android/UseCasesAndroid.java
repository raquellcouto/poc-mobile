package com.example.appium.platforms.android;

import com.example.appium.platforms.UseCases;
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
                        By.xpath("//android.widget.TextView[@resource-id=\"com.demomerchant.shopon.dev:id/txt_use_case_name\" and @text=\"Shop.on DEV (web checkout)\"]")
                )
        );
        shopOnWebCheckout.click();
    }
}
