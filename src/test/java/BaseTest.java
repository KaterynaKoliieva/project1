import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import utils.DriverSingleton;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    @BeforeTest
    public void profileSetUp()  {
        DriverSingleton.getDriver();
    }
    @BeforeMethod
    public void testsSetUp (){
        DriverSingleton.openUrl();
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
