package com.example.appium.platforms.android.alphamerchant.shopon;

import com.example.appium.platforms.android.alphamerchant.shopon.selectors.ShopOnSelectors;
import com.example.appium.platforms.interfaces.ShopOnBankDialog;
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
                        ShopOnSelectors.dialog
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
