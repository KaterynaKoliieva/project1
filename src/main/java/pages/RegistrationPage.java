package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email-input']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//button[@id='continueRegistrationButton']")
    private WebElement continueButton;


    public void enterEmailInTheEmailAddressField(String email) {
        waitForPageLoadComplete();
        emailAddressField.click();
        emailAddressField.sendKeys(email);
    }

    public void clickOnTheContinueButton() {
        continueButton.click();
    }
}
