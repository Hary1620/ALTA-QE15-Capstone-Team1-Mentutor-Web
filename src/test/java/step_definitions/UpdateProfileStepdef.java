package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Mentor.UpdateProfile;
import org.example.pageObject.Login;
import org.openqa.selenium.WebDriver;

public class UpdateProfileStepdef {
    private final WebDriver driver = Hooks.driver;
    UpdateProfile updateProfile = new UpdateProfile(driver);

    @Then("Click menu profile and icon pencil button")
    public void clickMenuProfileAndIconPencilButton() {
        updateProfile.clickProfileButton();
        updateProfile.clickPencilButton();
    }

    @And("Input name {string} email {string} password {string} and images")
    public void inputNameEmailPasswordAndImages(String name, String email, String password) {
        updateProfile.inputName(name);
        updateProfile.inputEmail(email);
        updateProfile.inputPassword(password);
        updateProfile.inputImages();
    }

    @Then("Click submit button and click ok button")
    public void clickSubmitButtonAndClickOkButton() {
        updateProfile.clickSubmitButton();
        updateProfile.clickOkButton();
        updateProfile.clickCloseButton();
    }
}
