package pages.screwfix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import static utils.Wait.waitForPageLoadComplete;

public class RegistrationCompletePage extends BasePage {

    public RegistrationCompletePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@class,'btn--primary sm-fill')]")
    private WebElement continueShoppingButton;

    public HomePageScrewfix clickOnTheContinueShoppingButton() throws InterruptedException {
        waitForPageLoadComplete();
        Thread.sleep(4000);
        continueShoppingButton.click();
        return new HomePageScrewfix(driver);
    }


}
