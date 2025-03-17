package com.example.appium.platforms.android.alphamerchant.gameon;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.GameOnTransactionResult;
import com.example.appium.platforms.ios.alphamerchant.gameon.selectors.GameOnSelector;
import io.appium.java_client.AppiumDriver;

public class GameOnTransactionResultAndroid extends BaseMethods implements GameOnTransactionResult {

    public GameOnTransactionResultAndroid(AppiumDriver driver){
        super(driver);

    }

    @Override
    public String depositCompletedMessage(){
        return "";
    }
}
