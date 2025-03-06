package com.example.appium.platforms.ios.alphamerchant.shopon;

import com.example.appium.platforms.interfaces.ShopOnBankDialog;
import com.example.appium.platforms.ios.alphamerchant.shopon.selectors.ShoponSelectors;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopOnBankDialogIOS implements ShopOnBankDialog {


    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnBankDialogIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnOkGotItButton(){
        WebElement okGotItButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        ShoponSelectors.okGotItButton
                )
        );

        okGotItButton.click();
    }




}
