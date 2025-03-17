package com.example.appium.platforms.ios.alphamerchant.gameon;


import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.GameOnAddFunds;
import com.example.appium.platforms.ios.alphamerchant.gameon.selectors.GameOnSelector;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class GameOnAddFundsIOS extends BaseMethods implements GameOnAddFunds {

    public GameOnAddFundsIOS (AppiumDriver driver){
        super(driver);

    }

    @Override
    public void selectDepositAmount(String amountValue) {
        By dynamicAmountSelector = AppiumBy.accessibilityId(amountValue);
        clickWhenClickable(dynamicAmountSelector);
    }

    @Override
    public void clickOnMakeDepositButton() {
        clickWhenClickable(GameOnSelector.makeDepositButton);
    }

}
