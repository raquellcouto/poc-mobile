package com.example.appium.platforms.ios.alphamerchant.custom;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.CustomScreen;
import com.example.appium.platforms.ios.alphamerchant.custom.selectors.CustomSelector;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public class CustomIOS extends BaseMethods implements CustomScreen {

    public CustomIOS (AppiumDriver driver){
        super(driver);

    }

    @Override
    public void selectEnvironment(String environment) {
        By environmentSelector = AppiumBy.accessibilityId(environment);
        clickWhenClickable(environmentSelector);
    }

    public void selectAmountValue(String amountValue){
        By environmentSelector = AppiumBy.accessibilityId(amountValue);
        clickWhenClickable(environmentSelector);
    }

    @Override
    public void clickOnContinueButton() {
        clickWhenClickable(CustomSelector.continueToDevButton);
    }

    @Override
    public void selectMerchant() {
        scrollUntilMiddleScreen();
        clickWithOffSet(CustomSelector.selectMerchant, 40);
    }

    @Override
    public boolean merchantIsPresent(String customMerchantName) {
        try {
            waitForElementToBeVisible(AppiumBy.accessibilityId(customMerchantName));
            return driver.findElement(AppiumBy.accessibilityId(customMerchantName)).isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {

            return false;
        }
    }



    @Override
    public void selectPaymentType(String paymentType) {
        By paymentTypeSelector = AppiumBy.accessibilityId(paymentType);
        clickWhenClickable(paymentTypeSelector);
    }

    @Override
    public void createCustomMerchant(String id, String name, String accessId, String accessKey) {

        clickElement(CustomSelector.customMerchant);

        clickAndClearElement(CustomSelector.customBeforeMerchantId);
        typeText(CustomSelector.customMerchantId, id);

        clickAndClearElement(CustomSelector.customBeforeMerchantName);
        typeText(CustomSelector.customMerchantName, name);

        clickAndClearElement(CustomSelector.customBeforeMerchantAccessId);
        typeText(CustomSelector.customMerchantAccessId, accessId);

        clickAndClearElement(CustomSelector.customBeforeMerchantAccessKey);
        typeText(CustomSelector.customMerchantAccessKey, accessKey);

        clickWhenClickable(CustomSelector.saveMerchantButton);
    }

    @Override
    public void createCustomAmount(String amount, String minimumBalance, String displayAmount) {
        typeText(CustomSelector.customAmount, amount);
        typeText(CustomSelector.customMinimumBalance, minimumBalance);
        typeText(CustomSelector.customDisplayAmount, displayAmount);

        clickWhenClickable(CustomSelector.saveAmountButton);
    }


}
