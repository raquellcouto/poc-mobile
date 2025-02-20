package com.example.appium.platforms.android;

import com.example.appium.platforms.SignInToYourBank;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SignInToYourBankAndroid implements SignInToYourBank {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public SignInToYourBankAndroid (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getUserNameField(){


        return  wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.widget.EditText[@resource-id=\"lbx-formAuthenticate-authFields-inputusername\"]")
                )
        );
    }

    public WebElement getPasswordField(){
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//android.widget.EditText[@resource-id=\"lbx-formAuthenticate-authFields-inputpassword\"]")
                )
        );
    }

    @Override
    public void enterUser(String user) {
        getUserNameField().sendKeys(user);
    }

    @Override
    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    @Override
    public void clickOnAgreeAndSignInButton() {
        List<WebElement> buttons = driver.findElements(By.className("android.widget.Button"));
        for (WebElement button : buttons) {
            if (button.getText().contains("Agree & Sign in")) {
                button.click();
                break;
            }
        }
    }

    @Override
    public void clickOnAgreeAndSignInText() {
    // this method is needed to ios only
    }
}
