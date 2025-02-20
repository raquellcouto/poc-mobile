package com.example.appium.platforms.ios;

import com.example.appium.platforms.SignInToYourBank;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.SupportsContextSwitching;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

        return wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`name == \"Username\"`]")
                )
        );


    }

    public WebElement getPasswordField(){
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//XCUIElementTypeSecureTextField[@name=\"Password\"]")
                )
        );
    }

    public void enterUser(String user){

        getUserNameField().sendKeys(user);
        System.out.println("mandou ein");
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void clickOnAgreeAndSignInText(){
        WebElement clickAndSignInText = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"By clicking 'Agree & Sign in', you agree to the Trustly\"]"));
        clickAndSignInText.click();
    }

    @Override
    public void clickOnAgreeAndSignInButton() {
        WebElement buttonDemoBankSingIn  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//XCUIElementTypeButton[@name=\"Agree & Sign in\"]")
                )
        );

        buttonDemoBankSingIn.click();
    }

}
