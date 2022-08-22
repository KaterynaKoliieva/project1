package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='user-name']")
    private WebElement signInButton;

    @FindBy(xpath = "//li[@class='acc']//span[@class='user-name']")
    private WebElement yourAccountButton;

    @FindBy(xpath = "//a[@id='header_link_sign_out']")
    private WebElement logOutButton;


    public String getTextFromSignInButton() {
        waitVisibilityOfElement(signInButton);
        return signInButton.getText();
    }

    public void clickOnTheAccountButton() {
        waitForTheElementToClick(yourAccountButton);
        yourAccountButton.click();
    }

    public void clickOnTheLogOutButton() {
        waitForTheElementToClick(logOutButton);
        logOutButton.click();
    }

    public String isLogOutCorrect(){
        waitVisibilityOfElement(yourAccountButton);
        return yourAccountButton.getText();
    }

}
