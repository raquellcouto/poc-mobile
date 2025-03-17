package com.example.appium.platforms.ios.sdk.selectbankwidget;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.SelectBankWidget;
import com.example.appium.platforms.ios.sdk.selectbankwidget.selectors.SelectBankWidgetSelector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class SelectBankWidgetIOS extends BaseMethods implements SelectBankWidget {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public SelectBankWidgetIOS (AppiumDriver driver){
        super(driver);
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    @Override
    public void searchBank(String bankName) {
        scrollUntilMiddleScreen();
        typeText(SelectBankWidgetSelector.searchbankField, bankName);

    }


    @Override
    public void clickOnBank() {

        clickWithOffSet(SelectBankWidgetSelector.cancelButton, 50);

    }
}
