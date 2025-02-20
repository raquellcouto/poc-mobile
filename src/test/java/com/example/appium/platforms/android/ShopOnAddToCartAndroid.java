package com.example.appium.platforms.android;

import com.browserstack.AppPercySDK;
import com.example.appium.platforms.ShopOnAddToCart;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ShopOnAddToCartAndroid implements ShopOnAddToCart {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnAddToCartAndroid (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Override
    public void clickIncrementButtons(AppiumDriver driver) {
        List<WebElement> addItemToCart = driver.findElements(By.id("com.demomerchant.shopon.dev:id/increase_ib"));

        for (WebElement addItem : addItemToCart) {
            addItem.click();
        }

    }

    @Override
    public void waitIncrementButtonLoad() {
        WebElement incrementButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("com.demomerchant.shopon.dev:id/increase_ib")
                )
        );
    }

    @Override
    public void clickOnGoToCartButton() {
        WebElement goToCartButton = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.demomerchant.shopon.dev:id/btn_products_cart\"]"));
        goToCartButton.click();
    }
}
