package step_definitions.Admin;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Admin.InputClass;
import org.example.pageObject.Admin.InputMember;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddNewMemberPage {
    private final WebDriver driver = Hooks.driver;
    InputMember inputMember = new InputMember(driver);

    @And("User click input member on the sidebar menu")
    public void userClickInputMemberOnTheSidebarMenu() {
        inputMember.clickButtonInputMember();
    }

    @And("User should be directed to Add member page")
    public void userShouldBeDirectedToAddMemberPage() {
        Assert.assertTrue(inputMember.verifyInputMemberPage());
    }

    @And("User input {string} as full name and {string} as email and choose {string} and choose {string} and input {string} as password")
    public void userInputAsFullNameAndAsEmailAndChooseAndChooseAndInputAsPassword(String Name, String Email, String Role, String Class, String Password) {
        inputMember.inputFullname(Name);
        inputMember.inputEmail(Email);
        inputMember.inputRole(Role);
        inputMember.inputClass(Class);
        inputMember.inputPassword(Password);
    }

    @Then("click add button")
    public void clickAddButton() {
        inputMember.clickButtonAddMember();
    }


    @Then("System should gift pop up error message {string}")
    public void systemShouldGiftPopUpErrorMessage(String errorMessage) {
        String actualMessage = inputMember.popUpNameErrorMessage();
        Assert.assertEquals(errorMessage, actualMessage);
    }

    @Then("System should gift pop up error message on email field {string}")
    public void systemShouldGiftPopUpErrorMessageOnEmailField(String errorEmail) {
        String actualMessage = inputMember.popUpEmailErrorMessage();
        Assert.assertEquals(errorEmail, actualMessage);
    }

    @Then("System should gift pop up error message on role field {string}")
    public void systemShouldGiftPopUpErrorMessageOnRoleField(String errorRole) {
        String actualMessage = inputMember.popUpRoleErrorMessage();
        Assert.assertEquals(errorRole, actualMessage);
    }

    @Then("System should gift pop up error message on class field {string}")
    public void systemShouldGiftPopUpErrorMessageOnClassField(String errorClass) {
        String actualMessage = inputMember.popUpPasswordErrorMessage();
        Assert.assertEquals(errorClass, actualMessage);
    }

    @Then("System should gift pop up invalid message  {string}")
    public void systemShouldGiftPopUpInvalidMessage(String specialChara) {
        String actualMessage = inputMember.popUpInvalidMessage();
        Assert.assertEquals(specialChara, actualMessage);
    }
}
