package com.example.appium.platforms.ios.sdk.signintoyourbank.selectors;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SignInToYourBankSelector {
    public static final By passwordField = By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]");
    public static final By agreeAndSignText = By.xpath("//XCUIElementTypeStaticText[@name=\"By clicking 'Agree & Sign in', you agree to the Trustly\"]");
    public static final By demoBankSignInButton = By.xpath("//XCUIElementTypeButton[@name=\"Agree & Sign in\"]");
    public static final By userNameField = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`name == \"Username\"`]");
}
