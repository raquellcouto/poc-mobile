package com.example.appium.platforms.android.alphamerchant.custom.selectors;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.CustomScreen;
import com.example.appium.platforms.ios.alphamerchant.custom.selectors.CustomSelector;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class CustomAndroid extends BaseMethods implements CustomScreen {

    public CustomAndroid(AppiumDriver driver){
        super(driver);

    }

    @Override
    public void selectEnvironment(String environment) {

    }

    @Override
    public void selectPaymentType(String paymentType) {

    }

    @Override
    public void createCustomMerchant(String id, String name, String accessId, String accessKey) {

    }

    @Override
    public void createCustomAmount(String amount, String minimumBalance, String displayAmount) {

    }

    @Override
    public void selectAmountValue(String amountValue) {

    }

    @Override
    public void clickOnContinueButton() {

    }

    @Override
    public void selectMerchant() {

    }

    @Override
    public boolean merchantIsPresent(String customMerchantName) {

        return false;
    }


}
