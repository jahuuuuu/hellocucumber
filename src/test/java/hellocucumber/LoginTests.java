package hellocucumber;

import hellocucumber.signin.SignInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(priority = 0)
    public void userRegistration() {

        MasterPage masterPage = new MasterPage();
        PageFactory.initElements(driver, masterPage);

        masterPage.clickSignInButton();

        SignInPage signInPage = new SignInPage();
        PageFactory.initElements(driver, signInPage);

        signInPage.fillEmailAddress();

    }
}