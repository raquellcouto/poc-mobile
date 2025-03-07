package com.example.appium.platforms.ios.alphamerchant.purchasesuccessful;

import com.example.appium.platforms.android.alphamerchant.purchasesuccessful.selectors.PurchaseSuccessfulSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.PurchaseSuccessful;
import com.example.appium.platforms.ios.alphamerchant.purchasesuccessful.selectors.PurchaseSuccessfullSelector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurchaseSuccessfulIOS extends BaseMethods implements PurchaseSuccessful {

    private static AppiumDriver driver;
    private static WebDriverWait finalWait;
    private static WebDriverWait wait;

    public PurchaseSuccessfulIOS (AppiumDriver driver){
        super(driver);
    }

    public String purchaseSuccessfulMessage(){

        return getText(PurchaseSuccessfullSelector.purchaseSucessefullMessage);
    }

    public void clickOnBackToUseCasesButton(){
        clickWhenClickable(PurchaseSuccessfullSelector.backToUseCasesButton);
    }
}
