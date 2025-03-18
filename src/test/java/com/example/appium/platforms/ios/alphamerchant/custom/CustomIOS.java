package com.example.appium.platforms.ios.alphamerchant.custom;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.CustomScreen;
import com.example.appium.platforms.ios.alphamerchant.custom.selectors.CustomSelector;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CustomIOS extends BaseMethods implements CustomScreen {

    public CustomIOS (AppiumDriver driver){
        super(driver);

    }

    @Override
    public void selectEnvironment(String environment) {
        By environmentSelector = AppiumBy.accessibilityId(environment);
        clickWhenClickable(environmentSelector);
    }
    
    @Override
    public void selectPaymentType(String paymentType) {
        By paymentTypeSelector = AppiumBy.accessibilityId(paymentType);
        clickWhenClickable(paymentTypeSelector);
    }

    @Override
    public void createCustomMerchant(String id, String name, String accessId, String accessKey) {
        clickAndClearElement(CustomSelector.customMerchantId);
        typeText(CustomSelector.customMerchantId, id);

        clickAndClearElement(CustomSelector.customMerchantName);
        typeText(CustomSelector.customMerchantName, name);

        clickAndClearElement(CustomSelector.customMerchantAccessId);
        typeText(CustomSelector.customMerchantAccessId, accessId);

        clickAndClearElement(CustomSelector.customMerchantAccessKey);
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
