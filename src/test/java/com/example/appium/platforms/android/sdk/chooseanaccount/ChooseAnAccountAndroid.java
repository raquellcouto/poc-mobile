package com.example.appium.platforms.android.sdk.chooseanaccount;

import com.example.appium.platforms.android.sdk.chooseanaccount.selectors.ChooseAnAccountSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.ChooseAnAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChooseAnAccountAndroid extends BaseMethods implements ChooseAnAccount {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ChooseAnAccountAndroid (AppiumDriver driver){
        super(driver);
    }

    @Override
    public void clickOnWithdrawnButton() {
        clickWhenClickable(ChooseAnAccountSelector.withdrawButton);
    }


}
