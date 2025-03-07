package com.example.appium.platforms.ios.sdk.chooseanaccount;

import browserstack.shaded.com.google.common.collect.ImmutableMap;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.ChooseAnAccount;
import com.example.appium.platforms.ios.sdk.chooseanaccount.selectors.ChooseAnAccountSelector;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class ChooseAnAccountIOS extends BaseMethods implements ChooseAnAccount {

    public ChooseAnAccountIOS (AppiumDriver driver){
        super(driver);

    }

    public void clickOnWithdrawnButton(){
        clickWhenClickable(ChooseAnAccountSelector.withdrawButton);
    }


}
