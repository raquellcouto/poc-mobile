package com.example.appium.platforms.ios.alphamerchant.shopon;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.ShopOnCheckout;
import com.example.appium.platforms.ios.alphamerchant.shopon.selectors.ShoponSelectors;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopOnCheckoutIOS extends BaseMethods implements ShopOnCheckout {


    public ShopOnCheckoutIOS  (AppiumDriver driver){
        super(driver);

    }

    public void clickOnCheckoutButton(){
        clickWhenClickable(ShoponSelectors.checkoutButton);
    }

    @Override
    public void clickOnPlaceOrderButton() {

        clickWhenClickable(ShoponSelectors.placeOrderButton);
    }
}
