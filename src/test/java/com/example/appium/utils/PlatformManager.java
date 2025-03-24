package com.example.appium.utils;
import com.example.appium.platforms.android.alphamerchant.custom.selectors.CustomAndroid;
import com.example.appium.platforms.android.alphamerchant.gameon.GameOnAddFundsAndroid;
import com.example.appium.platforms.android.alphamerchant.gameon.GameOnPaymentAddedSuccessfullyAndroid;
import com.example.appium.platforms.android.alphamerchant.gameon.GameOnTransactionResultAndroid;
import com.example.appium.platforms.android.alphamerchant.shopon.*;
import com.example.appium.platforms.android.alphamerchant.transactiondetail.TransactionDetailsAndroid;
import com.example.appium.platforms.android.alphamerchant.usecases.*;
import com.example.appium.platforms.android.sdk.chooseanaccount.ChooseAnAccountAndroid;
import com.example.appium.platforms.android.alphamerchant.purchasesuccessful.PurchaseSuccessfulAndroid;
import com.example.appium.platforms.android.sdk.selectbankwidget.SelectBankWidgetAndroid;
import com.example.appium.platforms.android.sdk.signintoyourbank.SignInToYourBankAndroid;
import com.example.appium.platforms.interfaces.*;
import com.example.appium.platforms.ios.alphamerchant.custom.CustomIOS;
import com.example.appium.platforms.ios.alphamerchant.gameon.GameOnAddFundsIOS;
import com.example.appium.platforms.ios.alphamerchant.gameon.GameOnPaymentAddedSuccessfullyIOS;
import com.example.appium.platforms.ios.alphamerchant.gameon.GameOnTransactionResultIOS;
import com.example.appium.platforms.ios.alphamerchant.purchasesuccessful.PurchaseSuccessfulIOS;
import com.example.appium.platforms.ios.alphamerchant.shopon.ShopOnAddToCartIOS;
import com.example.appium.platforms.ios.alphamerchant.shopon.ShopOnBankDialogIOS;
import com.example.appium.platforms.ios.alphamerchant.shopon.ShopOnCheckoutIOS;
import com.example.appium.platforms.ios.alphamerchant.transactiondetail.TransactionDetailsIOS;
import com.example.appium.platforms.ios.alphamerchant.usecases.UseCasesIOS;
import com.example.appium.platforms.ios.sdk.chooseanaccount.ChooseAnAccountIOS;
import com.example.appium.platforms.ios.sdk.selectbankwidget.SelectBankWidgetIOS;
import com.example.appium.platforms.ios.sdk.signintoyourbank.SignInToYourBankIOS;
import io.appium.java_client.AppiumDriver;

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

    public static GameOnPaymentAddedSuccessfully getGameOnPaymentAddedSuccessfullyScreen(AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new GameOnPaymentAddedSuccessfullyAndroid(driver);
            case "ios":
                return new GameOnPaymentAddedSuccessfullyIOS(driver);
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

    public static GameOnAddFunds getGameOnAddFundsScreen (AppiumDriver driver, String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return new GameOnAddFundsAndroid(driver);
            case "ios":
                return new GameOnAddFundsIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static CustomScreen getCustomScreen (AppiumDriver driver, String platform){
        switch (platform.toLowerCase()) {
            case "android":
                return new CustomAndroid(driver);
            case "ios":
                return new CustomIOS(driver);
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }

    public static GameOnTransactionResult getGameOnTransactionResultScreen(AppiumDriver driver, String platform){
        switch (platform.toLowerCase()) {
            case "android":
                return new GameOnTransactionResultAndroid(driver);
            case "ios":
                return new GameOnTransactionResultIOS(driver);
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
