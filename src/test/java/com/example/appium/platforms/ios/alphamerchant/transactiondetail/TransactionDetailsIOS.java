package com.example.appium.platforms.ios.alphamerchant.transactiondetail;

import com.example.appium.platforms.interfaces.TransactionDetails;
import com.example.appium.platforms.ios.alphamerchant.transactiondetail.selectors.TransactionDetailsSelector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransactionDetailsIOS implements TransactionDetails {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public TransactionDetailsIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickOnCloseButton(){
        WebElement closeButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        TransactionDetailsSelector.closeButton
                )
        );

        closeButton.click();
    }
}
