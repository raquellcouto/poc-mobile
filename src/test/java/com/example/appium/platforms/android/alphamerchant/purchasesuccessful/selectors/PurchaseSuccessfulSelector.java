package com.example.appium.platforms.android.alphamerchant.purchasesuccessful.selectors;

import org.openqa.selenium.By;

public class PurchaseSuccessfulSelector {
    public static final By purchaseSuccessfulMessage = By.xpath("//android.widget.TextView[@resource-id=\"com.demomerchant.shopon.dev:id/txt_purchase_status\"]");
    public static final By backToUseCasesButton = By.xpath("//android.widget.Button[@resource-id=\"com.demomerchant.shopon.dev:id/btn_back_to_use_cases\"]");
}
