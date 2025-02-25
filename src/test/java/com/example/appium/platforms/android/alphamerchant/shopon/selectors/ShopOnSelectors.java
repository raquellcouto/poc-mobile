package com.example.appium.platforms.android.alphamerchant.shopon.selectors;

import org.openqa.selenium.By;

public class ShopOnSelectors {
    public static final By addItemToCart = By.id("com.demomerchant.shopon.dev:id/increase_ib");
    public static final By incrementButton = By.id("com.demomerchant.shopon.dev:id/increase_ib");
    public static final By goToCartButton = By.xpath("//android.widget.Button[@resource-id=\"com.demomerchant.shopon.dev:id/btn_products_cart\"]");
    public static final By dialog = By.xpath("//android.app.Dialog[@text=\"Shop.on connects to your bank via Trustly\"]");
}
