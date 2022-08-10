package pages.screwfix;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import static utils.Wait.waitForPageLoadComplete;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email-input']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//button[@id='continueRegistrationButton']")
    private WebElement continueButton;

    @Step("Email: {email}")
    public RegistrationPage enterEmailInTheEmailAddressField(String email) {
        waitForPageLoadComplete();
        emailAddressField.click();
        emailAddressField.sendKeys(email);
        return this;
    }

    public CreateWebAccountPage clickOnTheContinueButton() {
        continueButton.click();
        return new CreateWebAccountPage(driver);
    }
}
