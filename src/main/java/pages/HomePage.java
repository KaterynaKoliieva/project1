package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;


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

    @FindBy(xpath = "//input[@id='mainSearch-input']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='search_submit_button']")
    private WebElement searchButton;


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

    public void enterTextInTheSearchField(String text){
        waitForTheElementToClick(searchField);
        searchField.click();
        searchField.sendKeys(text);
    }

    public void clickOnTheSearchButton(){
        waitForTheElementToClick(searchButton);
        searchButton.click();
    }

}
