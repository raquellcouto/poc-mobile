package com.example.appium.platforms.ios.sdk.chooseanaccount.selectors;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ChooseAnAccountSelector {
    public static final By withdrawButton = AppiumBy.iOSNsPredicateString("label CONTAINS 'Withdraw with account'");
}
