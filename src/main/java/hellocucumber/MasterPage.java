package hellocucumber;

import hellocucumber.signin.SignInPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPage {

    @FindBy(className = "login")
    private WebElement signIn;


    @When("^User click on SignIn button$")
    public MasterPage clickSignInButton() {
        signIn.click();
        return new SignInPage();
    }
}
