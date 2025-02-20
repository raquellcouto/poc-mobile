package com.example.appium.platforms.android;

import com.example.appium.platforms.PurchaseSuccessful;
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
                        By.xpath("//android.widget.TextView[@resource-id=\"com.demomerchant.shopon.dev:id/txt_purchase_status\"]")
                )
        );
        return purchaseSuccessfulMessage.getText();
    }

    @Override
    public void clickOnBackToUseCasesButton() {
        WebElement backToUseCasesButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.widget.Button[@resource-id=\"com.demomerchant.shopon.dev:id/btn_back_to_use_cases\"]")
                )
        );

        backToUseCasesButton.click();
    }
}
