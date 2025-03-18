package com.example.appium.platforms.base;

import com.example.appium.platforms.android.sdk.selectbankwidget.selectors.SelectBankWidgetSelector;
import com.example.appium.platforms.android.sdk.signintoyourbank.selectors.SignInToYourBankSelector;
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
import java.util.List;

public class BaseMethods {
    protected AppiumDriver driver;
    protected WebDriverWait wait;

    public BaseMethods(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Métodos utilitários para interação com elementos
    protected void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    protected void clickAndClearElement(By locator){
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(
                        locator
                )
        );
        element.clear();
        element.click();

    }

    protected void clickWhenClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected void clickByButtonName(String buttonName){
        WebElement genericButton  = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("android.widget.Button")
                )
        );

        List<WebElement> buttons = driver.findElements(By.className("android.widget.Button"));
        for (WebElement button : buttons) {
            if (button.getText().contains(buttonName)) {
                button.click();
                break;
            }
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean isElementVisible(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected void typeText(By locator, String text) {
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(
                        locator
                )
        );
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    protected void waitForElementToBeVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement searchForElement(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void scrollUntilMiddleScreen(){
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
    }

    protected void clickWithOffSet(By locator, int offSet){
        WebElement element= searchForElement(locator);

        // Obter o tamanho do elemento
        Point location = element.getLocation();
        Dimension size = element.getSize();

        // Calcular ponto central do elemento com offset
        int centerX = location.getX() + size.getWidth() / 2;
        int centerY = location.getY() + size.getHeight() / 2 + offSet;

        // Criar sequência de toque
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, centerY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));

    }


    // Configuração do timeout de espera
    protected void setWaitTimeout(int seconds) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }
}