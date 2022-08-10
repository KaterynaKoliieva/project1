package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static utils.DriverSingleton.getDriver;

public class Frames {

    public static void switchToFrame(WebElement iframe) {
        getDriver().switchTo().defaultContent();
        //try {
        //    if (iframe.isDisplayed())
                getDriver().switchTo().frame(iframe);
        //} catch (NoSuchElementException e){

        //}
    }

    public static void switchToDefaultContent() {
        getDriver().switchTo().defaultContent();
    }
}
