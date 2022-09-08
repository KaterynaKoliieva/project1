package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void openLoginPage(final String url) {
        driver.get(url);
    }
    @Step("Email: {emailOfTheRegisteredUser}")
    public void enterEmailInTheEmailField(String emailOfTheRegisteredUser) {
        waitForPageLoadComplete();
        implicitlyWait();
        try{
            if(iframe.isDisplayed()){
                driver.switchTo().defaultContent();
                driver.switchTo().frame(iframe);
                acceptCookiesButton.click();
                driver.switchTo().defaultContent();
            }
        } catch (NoSuchElementException e){}
        emailField.click();
        emailField.sendKeys(emailOfTheRegisteredUser);
    }

    @Step("Password: {passwordOfTheRegisteredUser}")
    public void enterPasswordInThePasswordField(String passwordOfTheRegisteredUser){
        passwordField.click();
        passwordField.sendKeys(passwordOfTheRegisteredUser);
    }

    public void clickTheSighInButton() {
        sighInButton.click();
    }

    public void clickTheRegisterNowButton() {
        waitForPageLoadComplete();
        implicitlyWait();
        try{
            if(iframe.isDisplayed()){
                driver.switchTo().defaultContent();
                driver.switchTo().frame(iframe);
                acceptCookiesButton.click();
                driver.switchTo().defaultContent();
            }
        } catch (NoSuchElementException e){}
        registerNowButton.click();
    }

    public void clickTheLogOutButton() {
        waitVisibilityOfElement(logOutButton);
        logOutButton.click();
    }

    public boolean isTheSignInButtonDisplayed() {
       return sighInButton.isDisplayed();
    }

}
