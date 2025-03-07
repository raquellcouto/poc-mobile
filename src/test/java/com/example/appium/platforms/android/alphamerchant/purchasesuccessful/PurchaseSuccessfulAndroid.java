package com.example.appium.platforms.android.alphamerchant.purchasesuccessful;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.android.alphamerchant.purchasesuccessful.selectors.PurchaseSuccessfulSelector;
import com.example.appium.platforms.interfaces.PurchaseSuccessful;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseSuccessfulAndroid extends BaseMethods implements PurchaseSuccessful {


    public PurchaseSuccessfulAndroid (AppiumDriver driver){
        super(driver);
    }

    @Override
    public String purchaseSuccessfulMessage() {

        return getText(PurchaseSuccessfulSelector.purchaseSuccessfulMessage);


    }

    @Override
    public void clickOnBackToUseCasesButton() {

        clickWhenClickable(PurchaseSuccessfulSelector.backToUseCasesButton);

    }
}
