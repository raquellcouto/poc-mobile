package com.example.appium.platforms.android.sdk.signintoyourbank.selectors;

import org.openqa.selenium.By;

public class SignInToYourBankSelector {
    public static final By passwordField = By.xpath("//android.widget.EditText[@resource-id=\"lbx-formAuthenticate-authFields-inputpassword\"]");
    public static final By userNameField = By.xpath("//android.widget.EditText[@resource-id=\"lbx-formAuthenticate-authFields-inputusername\"]");
}
