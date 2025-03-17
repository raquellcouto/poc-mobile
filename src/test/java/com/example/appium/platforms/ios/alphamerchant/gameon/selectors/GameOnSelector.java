package com.example.appium.platforms.ios.alphamerchant.gameon.selectors;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class GameOnSelector {
    public static final By backToCheckoutButton = AppiumBy.accessibilityId("Back to checkout");
    public static final By makeDepositButton = AppiumBy.accessibilityId("Make deposit");
    public static final By depositCompletedMessage = AppiumBy.accessibilityId("Deposit completed");
}
