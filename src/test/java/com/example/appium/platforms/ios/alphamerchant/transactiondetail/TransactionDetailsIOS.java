package com.example.appium.platforms.ios.alphamerchant.transactiondetail;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.TransactionDetails;
import com.example.appium.platforms.ios.alphamerchant.transactiondetail.selectors.TransactionDetailsSelector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransactionDetailsIOS extends BaseMethods implements TransactionDetails {

    public TransactionDetailsIOS (AppiumDriver driver){

        super(driver);
    }

    public void clickOnCloseButton(){

        clickWhenClickable(TransactionDetailsSelector.closeButton);

    }
}
