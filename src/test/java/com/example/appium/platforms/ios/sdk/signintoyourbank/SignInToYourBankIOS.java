package com.example.appium.platforms.ios.sdk.signintoyourbank;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.SignInToYourBank;
import com.example.appium.platforms.ios.sdk.signintoyourbank.selectors.SignInToYourBankSelector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class SignInToYourBankIOS extends BaseMethods implements SignInToYourBank {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public SignInToYourBankIOS (AppiumDriver driver){
        super(driver);
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(60));
    }


    public void enterUser(String user){
        System.out.println(driver.getPageSource());
        typeText(SignInToYourBankSelector.userNameField, user);

    }

    public void enterPassword(String password){
        typeText(SignInToYourBankSelector.passwordField, password);
    }

    public void clickOnAgreeAndSignInText(){
        clickWhenClickable(SignInToYourBankSelector.agreeAndSignText);
    }

    @Override
    public void clickOnAgreeAndSignInButton() {

        clickWhenClickable(SignInToYourBankSelector.demoBankSignInButton);

    }

}
