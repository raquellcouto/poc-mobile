package com.example.appium.platforms.ios.alphamerchant.shopon;

import com.example.appium.platforms.interfaces.ShopOnAddToCart;
import com.example.appium.platforms.ios.alphamerchant.shopon.selectors.ShoponSelectors;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopOnAddToCartIOS implements ShopOnAddToCart {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnAddToCartIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickIncrementButtons(AppiumDriver driver) {
        int numberOfElements = 3;

        // Loop para clicar em cada botão de incremento
        for (int i = 1; i <= numberOfElements; i++) {

            String xpath = "(//XCUIElementTypeButton[@name=\"Increment\"])[" + i + "]";

            WebElement element = driver.findElement(By.xpath(xpath));
            element.click();

            // pequena pausa antes de clicar no próximo
            try {
                Thread.sleep(500); // 500ms de pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void waitIncrementButtonLoad(){
        WebElement incrementButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        ShoponSelectors.incrementButton
                )
        );
    }

    public void clickOnGoToCartButton(){
        WebElement goToCartButton = driver.findElement(ShoponSelectors.goToCartButton);
        goToCartButton.click();
    }

}
