package step_definitions.LoginSteps;

import hooks.Hooks;
import io.cucumber.java.en.And;
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

    @And("System will show up pop up invalid message {string}")
    public void systemWillShowUpPopUpInvalidMessage(String message) {
        String actualMessage = loginAdmin.popUpInvalidMessage();
        Assert.assertEquals(message, actualMessage);
    }

    @And("System wil show up invalid password {string}")
    public void systemWilShowUpInvalidPassword(String message) {
        String actualMessage = loginAdmin.popUpInvalidPassword();
        Assert.assertEquals(message, actualMessage);
    }

    @And("System wil show up invalid password1 {string}")
    public void systemWilShowUpInvalidPassword1(String message) {
        String actualMessage = loginAdmin.popUpInvalidPassword1();
        Assert.assertEquals(message, actualMessage);
    }

    @And("System wil show up invalid password2 {string}")
    public void systemWilShowUpInvalidPassword2(String message) {
        String actualMessage = loginAdmin.popUpInvalidPassword2();
        Assert.assertEquals(message, actualMessage);
    }

    @And("System wil show up invalid password3 {string}")
    public void systemWilShowUpInvalidPassword3(String message) {
        String actualMessage = loginAdmin.popUpInvalidPassword3();
        Assert.assertEquals(message, actualMessage);
    }

}
