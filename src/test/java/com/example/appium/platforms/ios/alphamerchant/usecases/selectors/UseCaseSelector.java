package com.example.appium.platforms.ios.alphamerchant.usecases.selectors;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class UseCaseSelector {
    public static final By shopOnWebCheckoutUseCase = By.xpath("//XCUIElementTypeButton[@name=\"Shop.On (web checkout), Payment, eCommerce\"]");
    public static final By gameOnUseCase = AppiumBy.accessibilityId("Game.on");
    public static final By shopOnUseCase = AppiumBy.accessibilityId("Shop.on");
    public static final By customUseCase = AppiumBy.accessibilityId("Custom");
}
