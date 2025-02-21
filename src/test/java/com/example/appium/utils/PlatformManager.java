package com.example.appium.utils;
import com.example.appium.platforms.android.ChooseAnAccountAndroid;
import io.appium.java_client.AppiumDriver;
import com.example.appium.platforms.*;
import com.example.appium.platforms.android.*;
import com.example.appium.platforms.ios.*;

public class PlatformManager {
    public static UseCases getUseCasesScreen(AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new UseCasesAndroid(driver);
            case "ios":
                return new UseCasesIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static ChooseAnAccount getChooseAnAccountScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new ChooseAnAccountAndroid(driver);
            case "ios":
                return new ChooseAnAccountIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static PurchaseSuccessful getPurchaseSuccessfulScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new PurchaseSuccessfulAndroid(driver);
            case "ios":
                return new PurchaseSuccessfulIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static SelectBankWidget getSelectBankWidgetScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new SelectBankWidgetAndroid(driver);
            case "ios":
                return new SelectBankWidgetIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static ShopOnAddToCart getShopOnAddToCartScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new ShopOnAddToCartAndroid(driver);
            case "ios":
                return new ShopOnAddToCartIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static ShopOnBankDialog getShopOnBankDialogScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new ShopOnBankDialogAndroid(driver);
            case "ios":
                return new ShopOnBankDialogIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static ShopOnCheckout getShopOnCheckoutScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new ShopOnCheckoutAndroid(driver);
            case "ios":
                return new ShopOnCheckoutIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static SignInToYourBank getSignInToYourBankScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new SignInToYourBankAndroid(driver);
            case "ios":
                return new SignInToYourBankIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static TransactionDetails getTransactionDetailsScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new TransactionDetailsAndroid(driver);
            case "ios":
                return new TransactionDetailsIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

}
