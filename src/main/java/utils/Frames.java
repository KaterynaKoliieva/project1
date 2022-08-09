package utils;

import org.openqa.selenium.WebElement;

import static utils.DriverSingleton.getDriver;

public class Frames {

    public static void switchToFrame(WebElement iframe) {
        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame(iframe);
    }

    public static void switchToDefaultContent() {
        getDriver().switchTo().defaultContent();
    }
}
