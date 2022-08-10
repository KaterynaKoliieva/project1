package pages.screwfix;

import io.qameta.allure.Step;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.UsefulFunctions;

import java.util.List;

import static utils.Wait.*;

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

    public CreateWebAccountPage chooseTitle() {
        waitForPageLoadComplete();
        int rndNumber = UsefulFunctions.randomNumber(selectTitleButton.size());
        waitForTheElementToClick(selectTitleButton.get(rndNumber));
        selectTitleButton.get(rndNumber).click();
        return this;
    }

    public CreateWebAccountPage enterFirstAndLastNameInTheFirstNameAndLastNameField(String firstName, String lastName) {
        waitForTheElementToClick(firstNameButton);
        firstNameButton.click();
        firstNameButton.sendKeys(firstName);
        waitForTheElementToClick(lastNameButton);
        lastNameButton.click();
        lastNameButton.sendKeys(lastName);
        return this;
    }
    public CreateWebAccountPage chooseProfession() {
        int rndNumber = UsefulFunctions.randomNumber(selectProfessionButton.size());
        waitForTheElementToClick(selectProfessionButton.get(rndNumber));
        selectProfessionButton.get(rndNumber).click();
        return this;
    }

    public CreateWebAccountPage enterPostcode() throws InterruptedException {
        waitForTheElementToClick(postcodeButton);
        postcodeButton.click();
        postcodeButton.sendKeys(PageFactoryManager.configFileReader.getPostcode());
        waitForTheElementToClick(findAddressButton);
        findAddressButton.click();
        return this;
    }

    public CreateWebAccountPage selectAddress() {
        int rndNumber = UsefulFunctions.randomNumber(selectAddressButton.size());
        waitForTheElementToClick(selectAddressButton.get(rndNumber));
        selectAddressButton.get(rndNumber).click();
        return this;
    }
    @Step("Password: {password}")
    public CreateWebAccountPage enterAndRetypePassword(String password) throws InterruptedException {
        //String password = UsefulFunctions.randomName();
        passwordButton.click();
        passwordButton.sendKeys(password);
        retypePasswordButton.click();
        retypePasswordButton.sendKeys(password);
        Thread.sleep(4000);
        return this;
    }

    public RegistrationCompletePage clickOnTheRegisterNowButton() {
        registerNowButton.click();
        return new RegistrationCompletePage(driver);
    }


}
