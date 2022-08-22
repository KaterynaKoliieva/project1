package manager;

import org.openqa.selenium.WebDriver;
import pages.*;


public class PageFactoryManager {
    WebDriver driver;
    public PageFactoryManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage(){return new HomePage(driver); }
    public LogInPage getLogInPage(){return new LogInPage(driver); }
    public CreateWebAccountPage getCreateWebAccountPage(){return new CreateWebAccountPage(driver); }
    public RegistrationCompletePage getRegistrationCompletePage(){return new RegistrationCompletePage(driver); }
    public RegistrationPage getRegistrationPage(){return new RegistrationPage(driver); }

}
