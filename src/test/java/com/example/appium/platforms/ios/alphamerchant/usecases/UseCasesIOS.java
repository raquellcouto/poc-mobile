package com.example.appium.platforms.ios.alphamerchant.usecases;

import com.example.appium.platforms.base.BaseMethods;
import com.example.appium.platforms.interfaces.UseCases;
import com.example.appium.platforms.ios.alphamerchant.usecases.selectors.UseCaseSelector;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseCasesIOS extends BaseMethods implements UseCases {

    public UseCasesIOS (AppiumDriver driver){
        super(driver);

    }

    public void selectAndClickShopOnWebCheckout(){

        clickWhenClickable(UseCaseSelector.shopOnWebCheckoutUseCase);
    }

    public void selectAndClickGameOn(){
        clickWhenClickable(UseCaseSelector.gameOnUseCase);
    }

    @Override
    public void selectAndClickShopOn() {
        clickWhenClickable(UseCaseSelector.shopOnUseCase);
    }

    @Override
    public void clickOnUseCase(String useCase) {
        By environmentSelector = AppiumBy.accessibilityId(useCase);
        clickWhenClickable(environmentSelector);
    }


}
