package step_definitions.Mentor;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.Login.LoginMentor;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginMentorStepdef {
    private final WebDriver driver = Hooks.driver;
    LoginMentor loginMentor = new LoginMentor(driver);

    @Given("User open mentutor website")
    public void userOpenMentutorWebsite() {
        Assert.assertTrue(loginMentor.verifyLoginMentorPage());
    }

    @When("User input {string} as username and {string} as password")
    public void userInputAsUsernameAndAsPassword(String email, String password) {
        loginMentor.inputemail(email);
        loginMentor.inputPassword(password);
    }

    @Then("User click login button")
    public void userClickLoginButton() {
        loginMentor.clicklLoginButton();
    }

    @And("User should be redirect to dashboard page")
    public void userShouldBeRedirectToDashboardPage() {
        loginMentor.clickOKButton();
    }
}
