package com.example.appium.platforms.interfaces;

import io.appium.java_client.AppiumDriver;

public interface CustomScreen {
    void selectEnvironment(String environment);
    void selectPaymentType(String paymentType);
    void createCustomMerchant(String id, String name, String accessId, String accessKey);
    void createCustomAmount(String amount, String minimumBalance, String displayAmount);
}
