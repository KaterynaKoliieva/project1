package pages;


import manager.PageFactoryManager;
import utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchField;
    @FindBy(xpath = "//button[contains(@class,'button_color_green')]")
    private WebElement searchButton;

    public SearchPage enterTextInTheSearchField(){
        Wait.waitForPageLoadComplete();
        searchField.click();
        searchField.sendKeys(PageFactoryManager.configFileReader.enteredText());
        Wait.waitForTheElementToClick(searchButton);
        searchButton.click();
        return new SearchPage(driver);
    }

}
