import org.testng.Assert;
import org.testng.annotations.Test;
import static manager.PageFactoryManager.*;
import static utils.UsefulFunctions.*;

public class ScrewfixTests extends BaseTest{

    @Test
    public void checkLogIn() {
        Assert.assertEquals(businessLogicLayer.isLogInCorrect(emailOfTheRegisteredUser, passwordOfTheRegisteredUser), configFileReader.getSignInText());
    }

    @Test
    public void checkLogOut() {
        Assert.assertTrue(businessLogicLayer.isLogOutCorrect());
    }

    @Test()
    public void checkNewUniqueUserRegistration() throws InterruptedException {
        Assert.assertEquals(businessLogicLayer.newUserRegistration(firstName, lastName, password, email), fullName);
    }
}
