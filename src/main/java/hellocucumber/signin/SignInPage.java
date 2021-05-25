package hellocucumber.signin;

import hellocucumber.MasterPage;
import hellocucumber.configuration.TestData;
import hellocucumber.registrationpage.RegistrationPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends MasterPage {

    TestData testData = new TestData();

    @FindBy(id = "email_create")
    private WebElement emailAddress;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccount;

    @Then("^User can see registration site$")
    public RegistrationPage fillEmailAddress() {
        emailAddress.click();
        emailAddress.sendKeys(testData.email);
        createAnAccount.click();
        return new RegistrationPage();
    }

}