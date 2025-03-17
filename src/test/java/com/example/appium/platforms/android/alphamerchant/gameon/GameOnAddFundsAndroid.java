package com.example.appium.platforms.android.alphamerchant.gameon;

import com.example.appium.platforms.android.alphamerchant.gameon.selectors.GameOnSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.GameOnAddFunds;
import io.appium.java_client.AppiumDriver;

public class GameOnAddFundsAndroid extends BaseMethods implements GameOnAddFunds {

    public GameOnAddFundsAndroid(AppiumDriver driver){
        super(driver);

    }

    @Override
    public void selectDepositAmount(String amountValue) {

    }

    @Override
    public void clickOnMakeDepositButton() {
        clickWhenClickable(GameOnSelector.placeOrderButton);
    }

}
