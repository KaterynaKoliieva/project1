package pages.screwfix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static utils.Wait.waitForPageLoadComplete;
import static utils.Wait.waitVisibilityOfElement;

public class HomePageScrewfix extends BasePage {

    public HomePageScrewfix(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='header_my_account_link']")
    private WebElement yourAccountButton;

    @FindBy(xpath = "//a[@id='header_link_sign_out']")
    private WebElement logOutButton;

    @FindBy(xpath = "//span[@class='user-name']")
    private WebElement signInButton;

    public HomePageScrewfix clickTheYourAccountButton(){
        waitForPageLoadComplete();
        yourAccountButton.click();
        return this;
    }

    public HomePageScrewfix clickTheLogOutButton(){
        waitVisibilityOfElement(logOutButton);
        logOutButton.click();
        return this;
    }

    public String getTextFromSignInButton() {
        waitVisibilityOfElement(signInButton);
        return signInButton.getText();
    }

}
