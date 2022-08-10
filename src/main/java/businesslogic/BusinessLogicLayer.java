package businesslogic;

import pages.BasePage;
import org.openqa.selenium.WebDriver;

import static manager.PageFactoryManager.*;

public class BusinessLogicLayer extends BasePage {

    public BusinessLogicLayer(WebDriver driver) {
        super(driver);
    }

    public String isTheEnteredTextDisplayed() {
        return homePage.enterTextInTheSearchField()
                       .displayOfEnteredText();
    }

    public String isLogInCorrect(String emailOfTheRegisteredUser, String passwordOfTheRegisteredUser) {
         return logInPage.enterEmailInTheEmailField(emailOfTheRegisteredUser)
                         .enterPasswordInThePasswordField(passwordOfTheRegisteredUser)
                         .clickTheSighInButton()
                         .getTextFromSignInButton();
    }

    public String isLogOutCorrect() {
        return logInPage.clickTheLogOutButton()
                        .isTheSignInButtonDisplayed();
    }

    public String newUserRegistration(String firstName, String lastName, String password, String email) throws InterruptedException {
         return logInPage.clickTheRegisterNowButton()
                .enterEmailInTheEmailAddressField(email)
                .clickOnTheContinueButton()
                .chooseTitle()
                .enterFirstAndLastNameInTheFirstNameAndLastNameField(firstName, lastName)
                .chooseProfession()
                .enterPostcode()
                .selectAddress()
                .enterAndRetypePassword(password)
                .clickOnTheRegisterNowButton()
                .clickOnTheContinueShoppingButton()
                .getTextFromSignInButton();
    }
}
