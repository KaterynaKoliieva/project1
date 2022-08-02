import org.mytests.uiobjects.example.rozetka.manager.PageFactoryManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTextTest extends BaseTest{

    @Test
    public void checkTheEnteredText() {
        Assert.assertEquals(PageFactoryManager.businessLogicLayer.isTheEnteredTextDisplayed(), "«test»");
    }

}
