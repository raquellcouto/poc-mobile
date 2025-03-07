package com.example.appium.platforms.ios.alphamerchant.shopon;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.ShopOnBankDialog;
import com.example.appium.platforms.ios.alphamerchant.shopon.selectors.ShoponSelectors;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopOnBankDialogIOS extends BaseMethods implements ShopOnBankDialog {


    public ShopOnBankDialogIOS (AppiumDriver driver){
        super(driver);
    }

    public void clickOnOkGotItButton(){

        clickWhenClickable(ShoponSelectors.okGotItButton);

    }




}
