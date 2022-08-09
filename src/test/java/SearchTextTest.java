import org.testng.Assert;
import org.testng.annotations.Test;

import static manager.PageFactoryManager.businessLogicLayer;
import static manager.PageFactoryManager.configFileReader;


public class SearchTextTest extends BaseTest {
    @Test
    public void checkTheEnteredText() {
        Assert.assertEquals(businessLogicLayer.isTheEnteredTextDisplayed(), configFileReader.getEnteredText());
    }

}
