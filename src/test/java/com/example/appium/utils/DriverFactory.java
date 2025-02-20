package com.example.appium.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private static AppiumDriver driver;

    public static AppiumDriver getDriver(String platform) {
        if (driver == null){
            driver = initializeDriver(platform);
        }
        return driver;
    }

    private static AppiumDriver initializeDriver(String platform){
        DesiredCapabilities caps = new DesiredCapabilities();


        try {
            switch (platform.toLowerCase()){
                case "android":
                    return new AppiumDriver(
                            new URL("https://hub-cloud.browserstack.com/wd/hub"),
                            caps
                    );
                case "ios":
                    return new AppiumDriver(
                            new URL("https://hub-cloud.browserstack.com/wd/hub"),
                            caps
                    );

                default:
                    throw new IllegalArgumentException("Plataform not supported: " + platform);
            }
        }catch (MalformedURLException e){
            throw new RuntimeException("Erro ao configurar a URL do Appium Server", e);
        }
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}