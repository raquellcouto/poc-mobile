package com.example.appium.platforms.android.alphamerchant.usecases;

import com.example.appium.platforms.android.alphamerchant.shopon.selectors.ShopOnSelectors;
import com.example.appium.platforms.android.alphamerchant.usecases.selectors.UseCasesSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.UseCases;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseCasesAndroid extends BaseMethods implements UseCases {
    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public UseCasesAndroid (AppiumDriver driver){
        super(driver);
    }

    @Override
    public void selectAndClickShopOnWebCheckout() {
        clickWhenClickable(UseCasesSelector.shopOnWebCheckout);
    }
}
