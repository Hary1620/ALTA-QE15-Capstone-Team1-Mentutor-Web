package step_definitions.Mentee;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Mentee.Profile;
import org.example.pageObject.Mentee.Task;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditProfileSteps {
    private final WebDriver driver = Hooks.driver;
    Profile profile = new Profile(driver);

    @And("User click profile page on sidebar menu")
    public void userClickProfilePageOnSidebarMenu() {
        profile.clickButtonProfile();

    }

    @And("User click edit profile and input name {string} and input email {string} and input password {string}")
    public void userClickEditProfileAndInputNameAndInputEmailAndInputPasswordAndUploadProfilePicture(String name, String email, String password) {
        profile.editProfileMentee(name,email,password);
    }

    @And("User upload profile picture")
    public void userUploadProfilePicture() {
        profile.uploadProfilePicture();
    }

    @Then("User click submit update profile")
    public void userClickSubmitUpdateProfile() {
        profile.clickSubmitUpdateProfile();
    }


    @And("System will show up pop up failed message {string}")
    public void systemWillShowUpPopUpFailedMessage(String message) {
        String actualMessage = profile.popUpFailedMessage();
        Assert.assertEquals(message, actualMessage);
    }
}
