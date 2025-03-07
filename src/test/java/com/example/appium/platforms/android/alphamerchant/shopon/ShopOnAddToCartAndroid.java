package com.example.appium.platforms.android.alphamerchant.shopon;

import com.example.appium.platforms.android.alphamerchant.shopon.selectors.ShopOnSelectors;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.ShopOnAddToCart;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ShopOnAddToCartAndroid extends BaseMethods implements ShopOnAddToCart {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnAddToCartAndroid (AppiumDriver driver){
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Override
    public void clickIncrementButtons(AppiumDriver driver) {
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        ShopOnSelectors.incrementButton
                )
        );
        List<WebElement> addItemToCart = driver.findElements(ShopOnSelectors.addItemToCart);

        for (WebElement addItem : addItemToCart) {
            addItem.click();
        }

    }


    @Override
    public void clickOnGoToCartButton() {
        clickWhenClickable(ShopOnSelectors.goToCartButton);
    }
}
