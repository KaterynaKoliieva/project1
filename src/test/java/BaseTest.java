import utils.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void profileSetUp() {
        DriverSingleton.getDriver();
    }

    @BeforeMethod
    public void testsSetUp() {
        DriverSingleton.openUrl();
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
