package step_definitions.Mentor;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Mentor.UpdateProfile;
import org.junit.Assert;
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
        updateProfile.clearColumn();
        updateProfile.inputName(name);
        updateProfile.inputEmail(email);
        updateProfile.inputPassword(password);
        updateProfile.inputImages();
    }

    @Then("Click submit button edit profile")
    public void clickSubmitButtonAndClickOkButton() {
        updateProfile.clickSubmitButton();

    }

    @And("Modal success edit profile shows and click ok button")
    public void modalSuccessEditProfileShowsAndClickOkButton() {
        Assert.assertTrue(updateProfile.verifySuccessEditProfile());
        updateProfile.clickOkButton();
        updateProfile.clickCloseButton();
    }

    @And("Input name, email, password, and images empty")
    public void inputNameEmailPasswordAndImagesEmpty() {
        updateProfile.clearColumn();
    }

    @And("Modal failed edit profile shows and click ok button")
    public void modalFailedEditProfileShowsAndClickOkButton() {
        Assert.assertTrue(updateProfile.verifyFailedEditProfile());
        updateProfile.clickOkButton();
        updateProfile.clickCloseButton();
    }
}