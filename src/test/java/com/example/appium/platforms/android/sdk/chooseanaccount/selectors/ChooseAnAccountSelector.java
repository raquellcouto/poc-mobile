package com.example.appium.platforms.android.sdk.chooseanaccount.selectors;

import org.openqa.selenium.By;

public class ChooseAnAccountSelector {
    public static final By withdrawButton = By.xpath("//android.widget.Button[@resource-id=\"lbx-accountList-submit\"]");
    public static final By okButtonChangeYourPasswordDialog = By.id("com.android.chrome:id/positive_button");
}
