package Mentor_Stepdef;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.Login;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginMentorStepdef {
    private final WebDriver driver = Hooks.driver;
    Login login = new Login(driver);

    @Given("User open mentutor website")
    public void userOpenMentutorWebsite() {
        Assert.assertTrue(login.verifyLoginMentorPage());
    }

    @When("User input {string} as username and {string} as password")
    public void userInputAsUsernameAndAsPassword(String email, String password) {
        login.inputemail(email);
        login.inputPassword(password);
    }

    @Then("User click login button")
    public void userClickLoginButton() {
        login.clicklLoginButton();
    }

    @And("User should be redirect to dashboard page")
    public void userShouldBeRedirectToDashboardPage() {
        login.clickOKButton();
    }
}
