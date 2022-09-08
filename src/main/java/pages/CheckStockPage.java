package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckStockPage extends BasePage{

    public CheckStockPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='search_branch_textbox']")
    private WebElement findStoresField;

    @FindBy(xpath = "//button[@id='search_branch_button']")
    private WebElement findStoresButton;

    @FindBy(xpath = "//button[@class='lb-btn-cancel']")
    private WebElement closeButton;

    @FindBy(xpath = "//button[@id='add_for_collection_button_1']")
    private WebElement addToBasketButton;

    @FindBy(xpath = "//a[@href='/jsp/trolley/trolleyPage.jsp?reprice=true']")
    private WebElement basketButton;

    public void enterPostcodeInTheFindStoresField(String postcode) {
        waitForPageLoadComplete();
        findStoresField.click();
        findStoresField.sendKeys(postcode);
    }

    public void clickOnTheFindStoresButton() {
        waitForTheElementToClick(findStoresButton);
        findStoresButton.click();
    }

    public void chooseStore() {
        addToBasketButton.click();
        waitVisibilityOfElement(closeButton);
        closeButton.click();
    }

    public void clickTheBasketButton() {
        basketButton.click();
    }
}
