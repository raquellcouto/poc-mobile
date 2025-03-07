package com.example.appium.platforms.android.sdk.signintoyourbank;

import com.example.appium.platforms.android.sdk.signintoyourbank.selectors.SignInToYourBankSelector;
import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.SignInToYourBank;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SignInToYourBankAndroid extends BaseMethods implements SignInToYourBank {


    public SignInToYourBankAndroid (AppiumDriver driver){
        super(driver);
    }


    @Override
    public void enterUser(String user) {
        typeText(SignInToYourBankSelector.userNameField, user);
    }

    @Override
    public void enterPassword(String password) {

        typeText(SignInToYourBankSelector.passwordField, password);
    }

    @Override
    public void clickOnAgreeAndSignInButton() {
        clickByButtonName("Agree & Sign in");

    }

    @Override
    public void clickOnAgreeAndSignInText() {
    // this method is needed to ios only
    }
}
