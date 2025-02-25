package com.example.appium.platforms.android.alphamerchant.shopon;

import com.example.appium.platforms.interfaces.ShopOnCheckout;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ShopOnCheckoutAndroid implements ShopOnCheckout {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnCheckoutAndroid  (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
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
        WebElement placeOrderButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("android.widget.Button")
                )
        );

        List<WebElement> buttons = driver.findElements(By.className("android.widget.Button"));
        for (WebElement button : buttons) {
            if (button.getText().contains("Place order")) {
                button.click();
                break;
            }
        }
    }
}
