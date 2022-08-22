package pages;

import dataProvider.ConfigFileReader;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Timestamp;

import static utils.UsefulFunctions.email;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email-input']")
    private WebElement emailAddressField;

    @FindBy(xpath = "//button[@id='continueRegistrationButton']")
    private WebElement continueButton;

    @Step("Email: {email}")
    public void enterEmailInTheEmailAddressField() {
        waitForPageLoadComplete();
        emailAddressField.click();
        emailAddressField.sendKeys(email);
    }

    public void clickOnTheContinueButton() {
        continueButton.click();
    }
}
