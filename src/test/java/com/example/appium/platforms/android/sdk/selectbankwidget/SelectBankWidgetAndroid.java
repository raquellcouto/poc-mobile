package com.example.appium.platforms.android.sdk.selectbankwidget;

import com.example.appium.platforms.android.sdk.selectbankwidget.selectors.SelectBankWidgetSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.SelectBankWidget;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class SelectBankWidgetAndroid extends BaseMethods implements SelectBankWidget {

    public SelectBankWidgetAndroid (AppiumDriver driver){
        super(driver);
    }


    @Override
    public void searchBank(String bankName) {

        scrollUntilMiddleScreen();
        typeText(SelectBankWidgetSelector.searchBankElement, bankName);

    }

    @Override
    public void clickOnBank() {

        clickWithOffSet(SelectBankWidgetSelector.searchBankElement, 150);

    }
}
