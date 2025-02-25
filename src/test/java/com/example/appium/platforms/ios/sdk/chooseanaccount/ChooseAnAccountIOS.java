package com.example.appium.platforms.ios.sdk.chooseanaccount;

import com.example.appium.platforms.interfaces.ChooseAnAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChooseAnAccountIOS implements ChooseAnAccount {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ChooseAnAccountIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnWithdrawnButton(){
        WebElement WithdrawButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//XCUIElementTypeButton[@name=\"Withdraw with account Demo Savings Account\"]")
                )
        );

        WithdrawButton.click();
    }
}
