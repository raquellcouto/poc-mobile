package com.example.appium.platforms.android.alphamerchant.purchasesuccessful;

import com.example.appium.platforms.android.alphamerchant.purchasesuccessful.selectors.PurchaseSuccessfulSelector;
import com.example.appium.platforms.interfaces.PurchaseSuccessful;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PurchaseSuccessfulAndroid implements PurchaseSuccessful {

    private static AppiumDriver driver;
    private static WebDriverWait finalWait;
    private static WebDriverWait wait;

    public PurchaseSuccessfulAndroid (AppiumDriver driver){
        this.driver = driver;
        this.finalWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Override
    public String purchaseSuccessfulMessage() {
        WebElement purchaseSuccessfulMessage  = finalWait.until(
                ExpectedConditions.presenceOfElementLocated(
                        PurchaseSuccessfulSelector.PURCHASE_SUCCESSFUL_MESSAGE
                )
        );
        return purchaseSuccessfulMessage.getText();
    }

    @Override
    public void clickOnBackToUseCasesButton() {
        WebElement backToUseCasesButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        PurchaseSuccessfulSelector.BACK_TO_USE_CASES_BUTTON
                )
        );

        backToUseCasesButton.click();
    }
}
