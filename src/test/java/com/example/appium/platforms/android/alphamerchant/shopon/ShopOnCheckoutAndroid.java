package com.example.appium.platforms.android.alphamerchant.shopon;

import com.example.appium.platforms.android.alphamerchant.shopon.selectors.ShopOnSelectors;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.ShopOnCheckout;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ShopOnCheckoutAndroid extends BaseMethods implements ShopOnCheckout {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnCheckoutAndroid  (AppiumDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Override
    public void clickOnCheckoutButton() {

        WebElement checkoutButton = driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
                                "new UiSelector().resourceId(\"" + "com.demomerchant.shopon.dev:id/btn_checkout" + "\"))"
                )
        );

        checkoutButton.click();
    }

    @Override
    public void clickOnPlaceOrderButton() {
        scrollUntilMiddleScreen();
        if(isElementPresent(ShopOnSelectors.placeOrderButtonUpperCase)){
            clickByButtonName("PLACE ORDER");
        }
        else if(isElementPresent(ShopOnSelectors.placeOrderButtonLowerCase)){
            clickByButtonName("Place order");
        }

    }
}
