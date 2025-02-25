package com.example.appium.platforms.android.alphamerchant.transactiondetail;

import com.example.appium.platforms.android.alphamerchant.transactiondetail.selectors.TransactionDetailsSelector;
import com.example.appium.platforms.interfaces.TransactionDetails;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransactionDetailsAndroid implements TransactionDetails {
    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public TransactionDetailsAndroid (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Override
    public void clickOnCloseButton() {
        WebElement closeButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        TransactionDetailsSelector.closeButton
                )
        );
        closeButton.click();
    }
}
