package stepdefinitions;

import dataProvider.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import utils.UsefulFunctions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.UsefulFunctions.fullName;


public class DefinitionSteps {
    WebDriver driver;
    HomePage homePage;
    LogInPage logInPage;
    CreateWebAccountPage createWebAccountPage;
    RegistrationCompletePage registrationCompletePage;
    RegistrationPage registrationPage;
    ProductPage productPage;
    CheckStockPage checkStockPage;
    BasketPage basketPage;
    PageFactoryManager pageFactoryManager;
    @Before
    public void testsSetUp(){
        chromedriver().setup();;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
        homePage = pageFactoryManager.getHomePage();
        logInPage = pageFactoryManager.getLogInPage();
        registrationPage = pageFactoryManager.getRegistrationPage();
        createWebAccountPage = pageFactoryManager.getCreateWebAccountPage();
        registrationCompletePage = pageFactoryManager.getRegistrationCompletePage();
        productPage=pageFactoryManager.getProductPage();
        basketPage=pageFactoryManager.getBasketPage();
        checkStockPage=pageFactoryManager.getCheckStockPage();
    }
    @Given("User opens login page")
    public void openLoginPage() {
        logInPage.openLoginPage(ConfigFileReader.getApplicationUrl());
    }

    @When("User enters email in the Email field")
    public void enterEmailInTheEmailField() throws InterruptedException {
        System.out.println("CHECK enter Email");
        logInPage.enterEmailInTheEmailField(ConfigFileReader.getEnteredEmail());
    }

    @And("User enters password in the Password field")
    public void enterPasswordInThePasswordField() {
        logInPage.enterPasswordInThePasswordField(ConfigFileReader.getEnteredPassword());
    }

    @And("User clicks the Sign in button")
    public void clickTheSignInButton() {
        logInPage.clickTheSighInButton();
    }

    @Then("User sees his {string} in the Account field")
    public void checkFirstAndLastNameInTheAccountField(final String fullName) {
        assertEquals(homePage.getTextFromSignInButton(), fullName);
    }
    @And("User clicks the Your Account Button")
    public void clickTheYourAccountButton() {
        homePage.clickOnTheAccountButton();
    }
    @And("User clicks the log out button")
    public void clickTheLogOutButton() {
        homePage.clickOnTheLogOutButton();
    }

    @Then("User checks is the {string} button displayed")
    public void checkIsTheSignInButtonDisplayed(final String signInText) {
        assertEquals(homePage.isLogOutCorrect(), signInText);
    }
    @When("User clicks the Register now button")
    public void clickTheRegisterNowButton() {
        logInPage.clickTheRegisterNowButton();
    }

    @And("User enters email in the Email Address field")
    public void enterEmailInTheEmailAddressField() {
        String email = UsefulFunctions.email;
        Allure.addAttachment("Email: ", email);
        registrationPage.enterEmailInTheEmailAddressField(email);
    }

    @And("User clicks on the Continue button")
    public void clickOnTheContinueButton() {
        registrationPage.clickOnTheContinueButton();
    }

    @And("User chooses Title")
    public void chooseTitle() {
        createWebAccountPage.chooseTitle();
    }

    @And("User enters first name in the First Name field")
    public void enterFirstNameInTheFirstNameField() {
        createWebAccountPage.enterFirstNameInTheFirstNameField(UsefulFunctions.firstName);
    }

    @And("User enters last name in the Last Name field")
    public void enterLastNameInTheLastNameField() {
        createWebAccountPage.enterLastNameInTheLastNameField(UsefulFunctions.lastName);
    }

    @And("User chooses Profession")
    public void chooseProfession() {
        createWebAccountPage.chooseProfession();
    }

    @And("User enters Postcode")
    public void enterPostcode() throws InterruptedException {
        createWebAccountPage.enterPostcode();
    }

    @And("User selects Address")
    public void selectAddress() {
        createWebAccountPage.selectAddress();
    }

    @And("User enters password and retypes it in the Password and Re-type Password fields")
    public void enterPasswordAndRetypesItInThePasswordAndReTypePasswordFields() throws InterruptedException {
        String password = UsefulFunctions.password;
        Allure.addAttachment("Password: ", password);
        createWebAccountPage.enterAndRetypePassword(password);
    }

    @And("User clicks on the Register now button")
    public void clickOnTheRegisterNowButton() {
        createWebAccountPage.clickOnTheRegisterNowButton();
    }

    @When("User clicks the Continue Shopping button")
    public void clickTheContinueShoppingButton() throws InterruptedException {
        registrationCompletePage.clickOnTheContinueShoppingButton();
    }

    @And("User sees his first name and last name in the Account field")
    public void seeHisFirstNameAndLastNameInTheAccountField() {
        assertEquals(homePage.getTextFromSignInButton(), fullName);
    }
    @Given("User enters the {string} of the product in the search field")
    public void enterTheNameOfTheProductInTheSearchField(String name) {
        homePage.enterTextInTheSearchField(name);
        homePage.clickOnTheSearchButton();
    }

    @And("User clicks the Deliver button for the desired product1")
    public void clickTheDeliverButtonForTheDesiredProduct() {
        productPage.clickTheDeliveryButtonForTheDesiredProduct();
    }

    @And("User clicks the Click and Collect button for the desired product2")
    public void clickTheClickAndCollectButtonForTheDesiredProduct() {
        productPage.clickTheClickAndCollectButtonForTheDesiredProduct();
    }

    @And("User enters the {string} in the Find Stores Field")
    public void findStore(String postcode) {
        checkStockPage.enterPostcodeInTheFindStoresField(postcode);
        checkStockPage.clickOnTheFindStoresButton();
    }

    @And("User finds a suitable store")
    public void findsASuitableStore() {
        checkStockPage.chooseStore();
    }
    @And("User clicks the Basket button")
    public void userClicksTheBasketButton() {
        checkStockPage.clickTheBasketButton();
    }

    /* @And("User checks that the price under the heading and the total match for the first item")
    public void checkThatThePriceUnderTheHeadingAndTheTotalMatchForTheFirstItem() {
        assertEquals(basketPage.checkPriceUnderHeadingFieldForTheFirstProduct(),
                basketPage.checkTotalPriceFieldForTheFirstProduct());
    }*/

    @And("User checks if the Click And Collect button is selected for the product2")
    public void checkIfTheClickAndCollectButtonIsSelected() {
        assertTrue(basketPage.checkIsSelectedClickCollectButton());
    }

    /*@And("User checks that the price under the heading and the total match for the second item")
    public void checkThatThePriceUnderTheHeadingAndTheTotalMatchForTheSecondItem() {
        assertEquals(basketPage.checkPriceUnderHeadingFieldForTheSecondProduct(),
                basketPage.checkTotalPriceFieldForTheSecondProduct());
    }*/

    @And("User checks if the Delivery button is selected for the product1")
    public void checkIfTheDeliveryButtonIsSelected() {
        assertTrue(basketPage.checkIsSelectedDeliverButton());
    }

    @And("User checks Sub Total Field")
    public void checkSubTotalField() {
        assertEquals(basketPage.checkingSubTotalField(), basketPage.sumOfAllPrices(), 0.00);
    }

    @And("User checks the {string} of the Delivery Field")
    public void checkDeliveryField(String text) {
        assertEquals(basketPage.checkingDeliveryField(), text);
    }

    @And("User checks if the Total Field is the same as the Sub Total Field")
    public void checkTotalFieldIsTheSameAsTheSubTotalField() {
        assertEquals(basketPage.checkingTotalField(), basketPage.checkingSubTotalField(), 0.00);
    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
