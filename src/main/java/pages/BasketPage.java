package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class BasketPage extends BasePage{

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[@id='CPC_trolley_page_product_unit_price_1']")
    private WebElement priceUnderHeadingField1;

    @FindBy(xpath = "//span[@id='CPC_trolley_page_product_total_price_1']")
    private WebElement totalPriceField1;

    @FindBy(xpath = "//p[@id='trolley_page_product_unit_price_1']")
    private WebElement priceUnderHeadingField2;

    @FindBy(xpath = "//span[@id='trolley_page_product_total_price_1']")
    private WebElement totalPriceField2;

    @FindBy(xpath = "//a[@id='CPC_trolley_page_move_item_to_collection_268FX']")
    private WebElement selectedClickAndCollectButton;

    @FindBy(xpath = "//a[@id='trolley_page_move_item_to_delivery_412XT']")
    private WebElement selectedDeliverButton;

    @FindBy(xpath = "//div[@id='trolley_page_product_total_goods']")
    private WebElement subTotalField;

    @FindBy(xpath = "//div[@id='trolley_page_delivery']")
    private WebElement deliveryField;

    @FindBy(xpath = "//div[@id='trolley_page_grand_total']")
    private WebElement totalField;

    public String checkPriceUnderHeadingFieldForTheFirstProduct() {
        return priceUnderHeadingField1.getText();
    }

    public String checkPriceUnderHeadingFieldForTheSecondProduct() {
        return priceUnderHeadingField2.getText();
    }

    public String checkTotalPriceFieldForTheFirstProduct() {
        return totalPriceField1.getText();
    }

    public String checkTotalPriceFieldForTheSecondProduct() {
        return totalPriceField2.getText();
    }

    public boolean checkIsSelectedClickCollectButton() {
        return selectedClickAndCollectButton.isEnabled();
    }

    public boolean checkIsSelectedDeliverButton() {
        return selectedDeliverButton.isEnabled();
    }

    public double sumOfAllPrices(){
        double firstPrice = Double.parseDouble(totalPriceField1.getText().replace("£", ""));
        double secondPrice = Double.parseDouble(totalPriceField2.getText().replace("£", ""));
        String res_st = String.format(Locale.US, "%.2f", firstPrice+secondPrice);
        return Double.parseDouble(res_st);
    }
    public double checkingSubTotalField() {
        return Double.parseDouble(subTotalField.getText().replace("£", ""));
    }

    public String checkingDeliveryField() {
        return deliveryField.getText();
    }

    public double checkingTotalField() {
        return Double.parseDouble(totalField.getText().replace("£", ""));
    }



}
