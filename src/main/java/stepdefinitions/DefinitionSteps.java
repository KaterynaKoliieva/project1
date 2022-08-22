package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    }
    @Given("User opens login {string}")
    public void openLoginPage(final String url) {
        logInPage.openLoginPage(url);
    }

    @When("User enters {string} in the email field")
    public void enterEmailInTheEmailField(final String email) throws InterruptedException {
        logInPage.enterEmailInTheEmailField(email);
    }

    @And("User enters {string} in the password field")
    public void enterPasswordInThePasswordField(final String password) {
        logInPage.enterPasswordInThePasswordField(password);
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
        registrationPage.enterEmailInTheEmailAddressField();
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
        createWebAccountPage.enterAndRetypePassword();
    }

    @And("User clicks on the Register now button")
    public void clickOnTheRegisterNowButton() {
        createWebAccountPage.clickOnTheRegisterNowButton();
    }

    @When("User clicks the Continue Shopping button")
    public void clickTheContinueShoppingButton() throws InterruptedException {
        registrationCompletePage.clickOnTheContinueShoppingButton();
    }

    @Then("User sees his first name and last name in the Account field")
    public void seeHisFirstNameAndLastNameInTheAccountField() {
        assertEquals(homePage.getTextFromSignInButton(), fullName);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
