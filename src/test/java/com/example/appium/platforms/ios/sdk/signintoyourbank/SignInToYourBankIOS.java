package com.example.appium.platforms.ios.sdk.signintoyourbank;

import com.example.appium.platforms.interfaces.SignInToYourBank;
import com.example.appium.platforms.ios.sdk.signintoyourbank.selectors.SignInToYourBankSelector;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class SignInToYourBankIOS implements SignInToYourBank {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public SignInToYourBankIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public WebElement getUserNameField(){

        System.out.println(driver.getPageSource());

        return wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        SignInToYourBankSelector.userNameField
                )
        );


    }

    public WebElement getPasswordField(){
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        SignInToYourBankSelector.passwordField
                )
        );
    }

    public void enterUser(String user){

        getUserNameField().sendKeys(user);

    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void clickOnAgreeAndSignInText(){
        WebElement clickAndSignInText = driver.findElement(SignInToYourBankSelector.agreeAndSignText);
        clickAndSignInText.click();
    }

    @Override
    public void clickOnAgreeAndSignInButton() {
        WebElement buttonDemoBankSingIn  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        SignInToYourBankSelector.demoBankSignInButton
                )
        );

        buttonDemoBankSingIn.click();
    }

}
