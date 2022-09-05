package pages;

import dataProvider.ConfigFileReader;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.UsefulFunctions;


import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import static utils.UsefulFunctions.password;


public class CreateWebAccountPage extends BasePage {
    public CreateWebAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//select[@id='newTitle']/option")
    private List<WebElement> selectTitleButton;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameButton;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastNameButton;
    @FindBy(xpath = "//select[@id='profession']/option")
    private List<WebElement> selectProfessionButton;
    @FindBy(xpath = "//select[contains(@id,'contact-address')]/option")
    private List<WebElement> selectAddressButton;
    @FindBy(xpath = "//input[@id='contact-search-postcode']")
    private WebElement postcodeButton;

    @FindBy(xpath = "//button[contains(@class,'id-find-address-button')]")
    private WebElement findAddressButton;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordButton;

    @FindBy(xpath = "//input[@id='retypePassword']")
    private WebElement retypePasswordButton;

    @FindBy(xpath = "//button[@class='btn btn--primary fill btn--xl']")
    private WebElement registerNowButton;

    public void chooseTitle() {
        waitForPageLoadComplete();
        int rndNumber = UsefulFunctions.randomNumber(selectTitleButton.size());
        implicitlyWait();
        waitForTheElementToClick(selectTitleButton.get(rndNumber));
        selectTitleButton.get(rndNumber).click();
    }

    public String enterFirstNameInTheFirstNameField(String firstName) {
        waitForTheElementToClick(firstNameButton);
        firstNameButton.click();
        firstNameButton.sendKeys(firstName);
        return firstName;
    }

    public String enterLastNameInTheLastNameField(String lastName) {
        waitForTheElementToClick(lastNameButton);
        lastNameButton.click();
        lastNameButton.sendKeys(lastName);
        return lastName;
    }
    public void chooseProfession() {
        int rndNumber = UsefulFunctions.randomNumber(selectProfessionButton.size());
        implicitlyWait();
        waitForTheElementToClick(selectProfessionButton.get(rndNumber));
        selectProfessionButton.get(rndNumber).click();
    }

    public void enterPostcode() throws InterruptedException {
        waitForTheElementToClick(postcodeButton);
        postcodeButton.click();
        postcodeButton.sendKeys(ConfigFileReader.getPostcode());
        waitForTheElementToClick(findAddressButton);
        findAddressButton.click();
    }

    public void selectAddress() {
        int rndNumber = UsefulFunctions.randomNumber(selectAddressButton.size());
        implicitlyWait();
        waitForTheElementToClick(selectAddressButton.get(rndNumber));
        selectAddressButton.get(rndNumber).click();
    }
    @Step("Password: {password}")
    public void enterAndRetypePassword(String password) throws InterruptedException {
        passwordButton.click();
        passwordButton.sendKeys(password);
        retypePasswordButton.click();
        retypePasswordButton.sendKeys(password);
        threadSleep();
    }

    public void clickOnTheRegisterNowButton() {
        registerNowButton.click();
    }


}
