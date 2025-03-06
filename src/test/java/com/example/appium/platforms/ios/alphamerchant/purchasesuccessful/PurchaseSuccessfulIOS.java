package com.example.appium.platforms.ios.alphamerchant.purchasesuccessful;

import com.example.appium.platforms.android.alphamerchant.purchasesuccessful.selectors.PurchaseSuccessfulSelector;
import com.example.appium.platforms.interfaces.PurchaseSuccessful;
import com.example.appium.platforms.ios.alphamerchant.purchasesuccessful.selectors.PurchaseSuccessfullSelector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurchaseSuccessfulIOS implements PurchaseSuccessful {

    private static AppiumDriver driver;
    private static WebDriverWait finalWait;
    private static WebDriverWait wait;

    public PurchaseSuccessfulIOS (AppiumDriver driver){
        this.driver = driver;
        this.finalWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String purchaseSuccessfulMessage(){
        WebElement purchaseSuccessfulMessage  = finalWait.until(
                ExpectedConditions.presenceOfElementLocated(
                        PurchaseSuccessfullSelector.purchaseSucessefullMessage
                )
        );
        return purchaseSuccessfulMessage.getText();
    }

    public void clickOnBackToUseCasesButton(){
        WebElement backToUseCasesButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        PurchaseSuccessfullSelector.backToUseCasesButton
                )
        );

        backToUseCasesButton.click();
    }
}
