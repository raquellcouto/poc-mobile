package com.example.appium.platforms.ios.alphamerchant.gameon;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.GameOnPaymentAddedSuccessfully;
import com.example.appium.platforms.ios.alphamerchant.gameon.selectors.GameOnSelector;
import io.appium.java_client.AppiumDriver;

public class GameOnPaymentAddedSuccessfullyIOS extends BaseMethods implements GameOnPaymentAddedSuccessfully {

    public GameOnPaymentAddedSuccessfullyIOS (AppiumDriver driver){
        super(driver);

    }

    @Override
    public void clickOnBackToCheckout() {
        clickWhenClickable(GameOnSelector.backToCheckoutButton);
    }
}
