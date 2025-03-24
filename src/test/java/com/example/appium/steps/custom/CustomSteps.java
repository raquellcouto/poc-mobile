package com.example.appium.steps.custom;

import browserstack.shaded.com.google.common.collect.ImmutableMap;
import com.example.appium.platforms.interfaces.*;
import com.example.appium.utils.DriverFactory;
import com.example.appium.utils.PlatformManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.JavascriptExecutor;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomSteps{
    private static AppiumDriver driver;
    private UseCases useCases;
    private CustomScreen customScreen;


    @Before
    public void setUp() {
        DriverFactory.quitDriver();
        String platform = System.getProperty("platform", "ios");
        driver = DriverFactory.getDriver(platform);
        useCases = PlatformManager.getUseCasesScreen(driver, platform);
        customScreen = PlatformManager.getCustomScreen(driver, platform);



    }
    @Given("the use case selected was Custom use case")
    public void launchAlphaMerchantAndClickOnCustom(){
        useCases.clickOnUseCase("Custom");
    }

    @And("the merchant custom was selected")
    public void clickOnMerchantAndCustom(){
        customScreen.selectMerchant();
    }

    @And("a new merchant is configured")
    public void configureCustomMerchant(){
        customScreen.createCustomMerchant("110005514", "Globex test", "A48B73F694C4C8EE6306", "9D37BD31C761FA87463C");
    }

    @And("the application is closed")
    public void closeApplication(){
        driver.executeScript("mobile: terminateApp", ImmutableMap.of("bundleId", "com.trustly.app.trustlyalpha.dev"));
    }

    @Then("when opening the application again the recently saved merchant information should persist")
    public void openApplicationAndVerifyCustom(){
        driver.executeScript("mobile: activateApp", ImmutableMap.of("bundleId", "com.trustly.app.trustlyalpha.dev"));
        useCases.clickOnUseCase("Custom");
        customScreen.selectMerchant();
        assertTrue(customScreen.merchantIsPresent("Globex test"));

    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Scenario failed\"}}");
        } else {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"passed\", \"reason\": \"Scenario passed\"}}");
        }
    }

    @AfterAll
    public static void tearDown() {
        DriverFactory.quitDriver();
    }
}
