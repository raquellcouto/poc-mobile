package com.example.appium.platforms.android.alphamerchant.transactiondetail;

import com.example.appium.platforms.android.alphamerchant.transactiondetail.selectors.TransactionDetailsSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.TransactionDetails;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransactionDetailsAndroid extends BaseMethods implements TransactionDetails {


    public TransactionDetailsAndroid (AppiumDriver driver){
        super(driver);
    }

    @Override
    public void clickOnCloseButton() {

        clickWhenClickable(TransactionDetailsSelector.closeButton);
    }
}
