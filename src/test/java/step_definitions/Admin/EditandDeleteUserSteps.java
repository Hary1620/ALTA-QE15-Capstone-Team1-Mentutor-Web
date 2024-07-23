package step_definitions.Admin;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Admin.Home;
import org.example.pageObject.Admin.InputClass;
import org.openqa.selenium.WebDriver;

public class EditandDeleteUserSteps {
    private final WebDriver driver = Hooks.driver;
   Home home = new Home(driver);
    @And("User click dropdown menu on user and click {string} as edit user and input {string} as Name and user input {string} and user input {string} as password and user click {string} as new class")
    public void userClickDropdownMenuOnUserAndClickAsEditUserAndInputAsNameAndUserInputAndUserInputAsPasswordAndUserClickAsNewClass(String action, String name, String email, String password, String kelas) {
        home.SettingUser(action,name,email,password,kelas);
    }

    @Then("User click submit")
    public void userClickSubmit() {
        home.clickButtonSubmit();
    }

    @And("User clicks dropdown menu on user and click {string} as delete user")
    public void userClicksDropdownMenuOnUserAndClickAsDeleteUser(String delete) {
        home.SettingUser(delete,"","","","");
    }

    @Then("User click {string} as confirmation delete user")
    public void userClickAsConfirmationDeleteUser(String confirmation) {
        home.clickButtonConfirmation(confirmation);
    }
}
