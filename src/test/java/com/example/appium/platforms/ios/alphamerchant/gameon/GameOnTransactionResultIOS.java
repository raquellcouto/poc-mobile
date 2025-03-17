package com.example.appium.platforms.ios.alphamerchant.gameon;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.GameOnTransactionResult;
import com.example.appium.platforms.ios.alphamerchant.gameon.selectors.GameOnSelector;
import io.appium.java_client.AppiumDriver;

public class GameOnTransactionResultIOS extends BaseMethods implements GameOnTransactionResult {

    public GameOnTransactionResultIOS (AppiumDriver driver){
        super(driver);

    }

    @Override
    public String depositCompletedMessage(){
        return getText(GameOnSelector.depositCompletedMessage);
    }
}
