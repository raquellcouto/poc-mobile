package com.example.appium.platforms.ios.sdk.selectbankwidget;

import com.example.appium.platforms.interfaces.SelectBankWidget;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class SelectBankWidgetIOS implements SelectBankWidget {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public SelectBankWidgetIOS (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    public WebElement searchBankElement(){
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//XCUIElementTypeSearchField[@value=\"Search among 8k+ banks\"]")
                )
        );
    }

    @Override
    public void searchBank(String bankName) {
        searchBankElement().sendKeys(bankName);
    }



    @Override
    public void clickOnBank() {

        WebElement cancelButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//XCUIElementTypeButton[@name=\"Clear\"]")
                )
        );

        WebElement bankElement = cancelButton;

        // Obter o tamanho do elemento
        Point location = bankElement.getLocation();
        Dimension size = bankElement.getSize();

        // Calcular ponto central do elemento com offset
        int centerX = location.getX() + size.getWidth() / 2;
        int centerY = location.getY() + size.getHeight() / 2 + 50;

        // Criar sequência de toque
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));


    }
}
