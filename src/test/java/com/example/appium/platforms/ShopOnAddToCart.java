package com.example.appium.platforms;

import io.appium.java_client.AppiumDriver;

public interface ShopOnAddToCart {
    void clickIncrementButtons(AppiumDriver driver);
    void waitIncrementButtonLoad();
    void clickOnGoToCartButton();
}
