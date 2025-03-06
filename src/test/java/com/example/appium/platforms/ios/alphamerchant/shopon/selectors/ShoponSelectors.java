package com.example.appium.platforms.ios.alphamerchant.shopon.selectors;

import org.openqa.selenium.By;

public class ShoponSelectors {
    public static final By incrementButton = By.xpath("(//XCUIElementTypeButton[@name=\"Increment\"])[1]");
    public static final By goToCartButton = By.xpath("//XCUIElementTypeButton[@name=\"Go to cart\"]");
    public static final By okGotItButton = By.xpath("//XCUIElementTypeButton[@name=\"OK, got it!\"]");
    public static final By checkoutButton = By.xpath("//XCUIElementTypeButton[@name=\"Go to checkout\"]");
    public static final By placeOrderButton = By.xpath("//XCUIElementTypeButton[@name=\"Place order\"]");
}
