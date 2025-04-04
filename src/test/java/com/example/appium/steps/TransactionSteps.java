package com.example.appium.steps;


import com.example.appium.platforms.interfaces.*;
import com.example.appium.utils.DriverFactory;
import com.example.appium.utils.PlatformManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Scenario;


import org.openqa.selenium.JavascriptExecutor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.percy.appium.AppPercy;

public class TransactionSteps {
    private static AppiumDriver driver;
    private UseCases useCases;
    private ShopOnAddToCart shopOnAddToCart;
    private ShopOnCheckout shopOnCheckout;
    private SelectBankWidget selectBankWidget;
    private ShopOnBankDialog shopOnBankDialog;
    private SignInToYourBank signInToYourBank;
    private ChooseAnAccount chooseAnAccount;
    private TransactionDetails transactionDetails;
    private PurchaseSuccessful purchaseSuccessful;
    private GameOnPaymentAddedSuccessfully gameOnPaymentAddedSuccessfully;
    private GameOnAddFunds gameOnAddFunds;
    private GameOnTransactionResult gameOnTransactionResult;
    private CustomScreen customScreen;
    private AppPercy percy;


    @Before
    public void setUp() throws Exception {
        DriverFactory.quitDriver();
        String platform = System.getProperty("platform", "ios");
        driver = DriverFactory.getDriver(platform);
        useCases = PlatformManager.getUseCasesScreen(driver, platform);
        shopOnAddToCart = PlatformManager.getShopOnAddToCartScreen(driver, platform);
        shopOnCheckout = PlatformManager.getShopOnCheckoutScreen(driver, platform);
        selectBankWidget = PlatformManager.getSelectBankWidgetScreen(driver, platform);
        shopOnBankDialog = PlatformManager.getShopOnBankDialogScreen(driver, platform);
        signInToYourBank = PlatformManager.getSignInToYourBankScreen(driver, platform);
        chooseAnAccount = PlatformManager.getChooseAnAccountScreen(driver, platform);
        transactionDetails = PlatformManager.getTransactionDetailsScreen(driver, platform);
        purchaseSuccessful = PlatformManager.getPurchaseSuccessfulScreen(driver, platform);
        gameOnPaymentAddedSuccessfully = PlatformManager.getGameOnPaymentAddedSuccessfullyScreen(driver, platform);
        gameOnAddFunds = PlatformManager.getGameOnAddFundsScreen(driver, platform);
        gameOnTransactionResult = PlatformManager.getGameOnTransactionResultScreen(driver, platform);
        customScreen = PlatformManager.getCustomScreen(driver, platform);

        if (driver != null && driver.getSessionId() != null) {
            percy = new AppPercy(driver);
        }


    }

    @Given("I am on the use cases screen")
    public void iAmOnUseCasesScreen() {

        percy.screenshot("Use Cases Screen");
    }


    @When("I select the Shop On web checkout use case")
    public void selectWebCheckoutUseCase() {
        useCases.selectAndClickShopOnWebCheckout();
    }

    @When("I add items to cart")
    public void addItemsToCart() {
        shopOnAddToCart.clickIncrementButtons(driver);

    }

    @When("I click on go to cart button")
    public void clickOnGoToCartButton() {
        shopOnAddToCart.clickOnGoToCartButton();
    }

    @When("I click on checkout button")
    public void clickOnCheckoutButton() {
        shopOnCheckout.clickOnCheckoutButton();
    }

    @When("I search for bank {string}")
    public void searchBank(String banco) {
        selectBankWidget.searchBank(banco);
    }

    @When("I select the bank")
    public void clickOnBank() {
        selectBankWidget.clickOnBank();
    }

    @When("I click on ok got it")
    public void clickOnOkGotItButton() {
        shopOnBankDialog.clickOnOkGotItButton();
    }

    @When("I fill in username {string}")
    public void enterUser(String usuario) {
        signInToYourBank.enterUser(usuario);
    }

    @When("I fill in password {string}")
    public void enterPassword(String senha) {
        signInToYourBank.enterPassword(senha);
    }

    @When("I click on agree and sign in text")
    public void clickOnAgreeAndSignInText() {
        signInToYourBank.clickOnAgreeAndSignInText();
    }

    @When("I click on agree and sign in button")
    public void clickOnAgreeAndSignInButton() {
        signInToYourBank.clickOnAgreeAndSignInButton();
    }

    @When("I click on withdrawn button")
    public void clickOnWithdrawnButton() {
        chooseAnAccount.clickOnWithdrawnButton();
    }

    @When("I click on close button")
    public void clickOnCloseButton() {
        transactionDetails.clickOnCloseButton();
    }

    @When("I click on place order button")
    public void clickOnPlaceOrderButton() {
        shopOnCheckout.clickOnPlaceOrderButton();
    }

    @Then("I should see the message {string}")
    public void purchaseSuccessfulMessage(String expectedMessage) {
        String actualMessage;
        if(expectedMessage.equals("Purchase successful")){
            actualMessage = purchaseSuccessful.purchaseSuccessfulMessage();
        }
        else if(expectedMessage.equals("Deposit completed")){
            actualMessage =gameOnTransactionResult.depositCompletedMessage();
        } else {
            throw new IllegalArgumentException("Mensagem não reconhecida: " + expectedMessage);
        }
        assertEquals(expectedMessage, actualMessage);
    }

    @Then("I go back to use cases screen")
    public void clickOnBackToUseCasesButton() {
        purchaseSuccessful.clickOnBackToUseCasesButton();
    }


    @When("I select the Game.on use case")
    public void selectGameOnUseCase() {
        useCases.selectAndClickGameOn();
    }

    @Then("I click on back to checkout button")
    public void clickOnBackToCheckoutButton(){
        gameOnPaymentAddedSuccessfully.clickOnBackToCheckout();
    }
    @Then("I choose a deposit amount value {string}")
    public void clickOnDepositAmountValue(String amountValue){
        gameOnAddFunds.selectDepositAmount(amountValue);
    }

    @Then("I click on Make deposit button")
    public void clickOnMakeDepositButton(){
        gameOnAddFunds.clickOnMakeDepositButton();
    }

    @When("I select the Shop.On use case")
    public void selectAndClickShopOn(){
        useCases.selectAndClickShopOn();
    }

    @When("I select the {string} use case")
    public void selectCustomUseCase(String useCase){
        useCases.clickOnUseCase(useCase);
    }

    @Then("I choose the amount value {string}")
    public void selectAmountValue(String amountValue){
        customScreen.selectAmountValue(amountValue);
    }

    @Then("I choose the Environment {string}")
    public void selectEnvironment(String environment){
        customScreen.selectEnvironment(environment);
    }

    @Then("I choose the payment type {string}")
    public void selectPaymentType(String paymentType){
        customScreen.selectPaymentType(paymentType);
    }

    @Then("I click on continue button")
    public void clickOnContinueButton(){
        customScreen.clickOnContinueButton();
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