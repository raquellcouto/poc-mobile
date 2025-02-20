package com.example.appium.platforms.android;

import com.example.appium.platforms.ShopOnBankDialog;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ShopOnBankDialogAndroid implements ShopOnBankDialog {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public ShopOnBankDialogAndroid (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Override
    public void clickOnOkGotItButton() {
        WebElement dialog = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//android.app.Dialog[@text=\"Shop.on connects to your bank via Trustly\"]")
                )
        );
        // gambiarra
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dialog.click();

        List<WebElement> buttons = driver.findElements(By.className("android.widget.Button"));
        for (WebElement button : buttons) {
            if (button.getText().contains("OK, got it!")) {
                button.click();
                break;
            }
        }
        //gambiarra
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
