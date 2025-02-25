package com.example.appium.platforms.android.alphamerchant.purchasesuccessful.selectors;

import org.openqa.selenium.By;

public class PurchaseSuccessfulSelector {
    public static final By PURCHASE_SUCCESSFUL_MESSAGE = By.xpath("//android.widget.TextView[@resource-id=\"com.demomerchant.shopon.dev:id/txt_purchase_status\"]");
    public static final By BACK_TO_USE_CASES_BUTTON = By.xpath("//android.widget.Button[@resource-id=\"com.demomerchant.shopon.dev:id/btn_back_to_use_cases\"]");
}
