package pages.screwfix;

import io.qameta.allure.Step;
import org.openqa.selenium.*;


import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.Frames;

import static utils.Wait.*;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email-existing']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password-field']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='sign-in-btn']")
    private WebElement sighInButton;

    @FindBy(xpath = "//a[@id='header_link_sign_out']")
    private WebElement logOutButton;


    @FindBy(xpath = "//a[@class='call']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//iframe[@class='truste_popframe']")
    private WebElement iframe;

    @FindBy(xpath = "//button[contains(@class,'id-register-button')]")
    private WebElement registerNowButton;

    @Step("Email: {email}")
    public LogInPage enterEmailInTheEmailField(String emailOfTheRegisteredUser) {
        waitForPageLoadComplete();
        implicitlyWait();
        try{
            if(iframe.isDisplayed()){
                Frames.switchToFrame(iframe);
                acceptCookiesButton.click();
                Frames.switchToDefaultContent();
            }
        } catch (NoSuchElementException e){}
        emailField.click();
        emailField.sendKeys(emailOfTheRegisteredUser);
        return this;
    }

    @Step("Password: {passwordOfTheRegisteredUser}")
    public LogInPage enterPasswordInThePasswordField(String passwordOfTheRegisteredUser){
        passwordField.click();
        passwordField.sendKeys(passwordOfTheRegisteredUser);
        return this;
    }

    public HomePageScrewfix clickTheSighInButton() {
        sighInButton.click();
        return new HomePageScrewfix(driver);
    }

    public RegistrationPage clickTheRegisterNowButton() {
        waitForPageLoadComplete();
        try{
            if(iframe.isDisplayed()){
                Frames.switchToFrame(iframe);
                acceptCookiesButton.click();
                Frames.switchToDefaultContent();
            }
        } catch (NoSuchElementException e){}
        registerNowButton.click();
        return new RegistrationPage(driver);
    }

    public LogInPage clickTheLogOutButton() {
        logOutButton.click();
        return this;
    }

    public String isTheSignInButtonDisplayed() {
       return sighInButton.getText();
    }

}
