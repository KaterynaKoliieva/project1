package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[@class='lii__title']")
    private List<WebElement> headerNames;

    @FindBy(xpath = "//button[@id='product_add_button_412XT']")
    private WebElement deliverButton;

    @FindBy(xpath = "//button[@id='continue_button_btn']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//button[@id='add_for_collection_button_268FX']")
    private WebElement clickAndCollectButton;

    public void clickTheDeliveryButtonForTheDesiredProduct() {
        deliverButton.click();
        if(continueShoppingButton.isDisplayed())
            continueShoppingButton.click();
    }

    public void clickTheClickAndCollectButtonForTheDesiredProduct() {
        clickAndCollectButton.click();
    }

}
