package com.example.appium.platforms.android.alphamerchant.usecases.selectors;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class UseCasesSelector {

    public static final By shopOnWebCheckoutUseCase =  By.xpath("//android.widget.TextView[@resource-id=\"com.demomerchant.shopon.dev:id/txt_use_case_name\" and @text=\"Shop.on DEV (web checkout)\"]");
    public static final By gameOnUseCase = By.xpath("//android.widget.TextView[@resource-id=\"com.demomerchant.shopon.dev:id/txt_use_case_name\" and @text=\"Game.on (with Approval Advice)\"]");
    public static final By shopOnUseCase = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.demomerchant.shopon.dev:id/lyt_use_case_item\").instance(0)");
}
