package pages.screwfix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import static utils.Wait.waitVisibilityOfElement;

public class HomePageScrewfix extends BasePage {

    public HomePageScrewfix(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='user-name']")
    private WebElement signInButton;

    public String getTextFromSignInButton() {
        waitVisibilityOfElement(signInButton);
        return signInButton.getText();
    }

}
