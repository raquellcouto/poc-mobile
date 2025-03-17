package com.example.appium.platforms.android.alphamerchant.gameon;

import com.example.appium.platforms.android.alphamerchant.gameon.selectors.GameOnSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.GameOnPaymentAddedSuccessfully;
import io.appium.java_client.AppiumDriver;

public class GameOnPaymentAddedSuccessfullyAndroid extends BaseMethods implements GameOnPaymentAddedSuccessfully {

    public GameOnPaymentAddedSuccessfullyAndroid(AppiumDriver driver){
        super(driver);

    }

    @Override
    public void clickOnBackToCheckout() {
        clickWhenClickable(GameOnSelector.proceedToCheckoutButton);
    }
}
