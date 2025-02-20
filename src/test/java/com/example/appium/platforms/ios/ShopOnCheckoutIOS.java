package com.example.appium.platforms.ios;

import com.example.appium.platforms.ShopOnCheckout;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopOnCheckoutIOS implements ShopOnCheckout {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnCheckoutIOS  (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnCheckoutButton(){
        WebElement checkoutButton = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Go to checkout\"]"));
        checkoutButton.click();
    }

    @Override
    public void clickOnPlaceOrderButton() {
        WebElement placeOrderButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//XCUIElementTypeButton[@name=\"Place order\"]")
                )
        );

        placeOrderButton.click();
    }
}
