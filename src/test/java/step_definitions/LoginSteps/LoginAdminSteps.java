package step_definitions.LoginSteps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.Login.LoginAdmin;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginAdminSteps {
    private final WebDriver driver = Hooks.driver;
    LoginAdmin loginAdmin = new LoginAdmin(driver);

    @Given("user open mentutor website")
    public void userOpenMentutorWebsite() {
        Assert.assertTrue(loginAdmin.verifyLoginPage());
    }

    @When("User input {string} as email and {string} as password and click login")
    public void userInputAsEmailAndAsPasswordAndClickLogin(String Email, String Password) {
        loginAdmin.inputFieldEmail(Email);
        loginAdmin.inputFieldPassword(Password);
        loginAdmin.clickButtonLogin();
    }

    @Then("User should be directed to the dashboard page")
    public void userShouldBeDirectedToTheDashboardPage() {
        Assert.assertTrue(loginAdmin.verifyLabelProduct());
    }
}
