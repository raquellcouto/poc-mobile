package com.example.appium.platforms.android.sdk.selectbankwidget;

import com.example.appium.platforms.android.sdk.selectbankwidget.selectors.SelectBankWidgetSelector;
import com.example.appium.platforms.interfaces.SelectBankWidget;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class SelectBankWidgetAndroid implements SelectBankWidget {

    private static AppiumDriver driver;
    private static WebDriverWait wait;

    public SelectBankWidgetAndroid (AppiumDriver driver){
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public WebElement searchBankElement(){
        return wait.until(
                ExpectedConditions.elementToBeClickable(
                        SelectBankWidgetSelector.searchBankElement
                )
        );
    }

    @Override
    public void searchBank(String bankName) {
        //

        Dimension size = driver.manage().window().getSize();

        // Calcular pontos de início e fim do scroll
        int startX = size.width / 2;
        int startY = size.height * 3 / 4;  // 3/4 da altura da tela
        int endY = size.height / 4;        // 1/4 da altura da tela

        // Criar sequência de movimento
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(scroll));

        searchBankElement().sendKeys(bankName);
    }

    @Override
    public void clickOnBank() {

        WebElement bankElement = searchBankElement();

        // Obter o tamanho do elemento
        Point location = bankElement.getLocation();
        Dimension size = bankElement.getSize();

        // Calcular ponto central do elemento com offset
        int centerX = location.getX() + size.getWidth() / 2;
        int centerY = location.getY() + size.getHeight() / 2 + 150;

        // Criar sequência de toque
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));

    }
}
