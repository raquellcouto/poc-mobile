package com.example.appium.platforms.ios.sdk.chooseanaccount;

import browserstack.shaded.com.google.common.collect.ImmutableMap;
import com.example.appium.platforms.interfaces.ChooseAnAccount;
import com.example.appium.platforms.ios.sdk.chooseanaccount.selectors.ChooseAnAccountSelector;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class ChooseAnAccountIOS implements ChooseAnAccount {

    private static AppiumDriver driver;
    private static WebDriverWait wait;
    private static WebDriverWait longWait;

    public ChooseAnAccountIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        this.longWait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void clickOnWithdrawnButton(){
        WebElement WithdrawButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        ChooseAnAccountSelector.withdrawButton
                )
        );

        WithdrawButton.click();
    }


}
