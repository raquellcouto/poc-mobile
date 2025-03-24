package com.example.appium.platforms.ios.alphamerchant.custom.selectors;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CustomSelector {
    public static final By continueToDevButton = AppiumBy.accessibilityId("Continue to Dev - Trustly Alpha");
    public static final By selectMerchant = AppiumBy.accessibilityId("Merchant");
    public static final By selectCurrency = AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`value == \"USD - United States\"`]/XCUIElementTypeStaticText");
    public static final By selectUser = AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`value == \"US - John Smith\"`]/XCUIElementTypeStaticText");
    public static final By selectLanguage = AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`value == \"English (en) - USA (us)\"`]/XCUIElementTypeStaticText");
    public static final By selectIntegrationContext = AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`value == \"InAppBrowser\"`]/XCUIElementTypeStaticText");
    public static final By selectInvalidSignature = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Invalid Signature\"`][2]");
    public static final By selectDarkMode = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Dark Mode\"`][2]");
    public static final By selectFinishButtonLabelType= AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`value == \"withdraw\"`]/XCUIElementTypeStaticText");
    public static final By selectRequestCustomerId = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Request Customer ID\"`][2]");
    public static final By selectCustomDataField = AppiumBy.accessibilityId("{\"metadata\":{\"flowId\":\"custom\"}}");

    public static final By customAmount = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Amount\"`]");
    public static final By customMinimumBalance = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Amount\"`]");
    public static final By customDisplayAmount = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Display amount\"`]");
    public static final By saveAmountButton = AppiumBy.accessibilityId("SAVE AMOUNT");

    public static final By customMerchantGameOn = AppiumBy.accessibilityId("Game.on");
    public static final By customMerchantGlobex = AppiumBy.accessibilityId("Globex");
    public static final By customMerchantShopOn = AppiumBy.accessibilityId("Shop.on");
    public static final By customMerchant = AppiumBy.accessibilityId("Custom");

    public static final By customBeforeMerchantId = By.xpath("//XCUIElementTypeTextField[@value=\"110005514\"]");
    public static final By customMerchantId = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"ID\"`]");
    public static final By customBeforeMerchantName = By.xpath("//XCUIElementTypeTextField[@value=\"Globex\"]");
    public static final By customMerchantName = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Name\"`]");
    public static final By customBeforeMerchantAccessId = By.xpath("//XCUIElementTypeTextField[@value=\"A48B73F694C4C8EE6306\"]");
    public static final By customMerchantAccessId = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Access ID\"`]");
    public static final By customBeforeMerchantAccessKey = By.xpath("//XCUIElementTypeTextField[@value=\"9D37BD31C761FA87463C\"]");
    public static final By customMerchantAccessKey = AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == \"Access Key\"`]");
    public static final By saveMerchantButton = AppiumBy.accessibilityId("SAVE MERCHANT");


}
