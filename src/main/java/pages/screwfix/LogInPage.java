package pages.screwfix;

import manager.PageFactoryManager;
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

    public LogInPage enterEmailInTheEmailField() {
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
        emailField.sendKeys(PageFactoryManager.configFileReader.getEnteredEmail());
        return this;
    }

    public LogInPage enterPasswordInThePasswordField(){
        passwordField.click();
        passwordField.sendKeys(PageFactoryManager.configFileReader.getEnteredPassword());
        return this;
    }

    public HomePageScrewfix clickTheSighInButton() {
        sighInButton.click();
        return new HomePageScrewfix(driver);
    }

    public RegistrationPage clickTheRegisterNowButton() {
        waitForPageLoadComplete();
        implicitlyWait();
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
