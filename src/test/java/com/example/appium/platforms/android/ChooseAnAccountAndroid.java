package com.example.appium.platforms.android;

import com.example.appium.platforms.ChooseAnAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChooseAnAccountAndroid implements ChooseAnAccount {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ChooseAnAccountAndroid (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Override
    public void clickOnWithdrawnButton() {
        WebElement WithdrawButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.widget.Button[@resource-id=\"lbx-accountList-submit\"]")
                )
        );

        WithdrawButton.click();
    }
}
