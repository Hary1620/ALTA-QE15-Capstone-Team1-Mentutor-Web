package step_definitions.Admin;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.hu.De;
import org.example.pageObject.Admin.InputClass;
import org.openqa.selenium.WebDriver;

public class EditandDeleteClassSteps {
    private final WebDriver driver = Hooks.driver;
    InputClass inputClass = new InputClass(driver);

//    @And("User clicks dropdown menu on class {int} and click {string} as edit class  and input {string} as new class name  and edit status {string}")
//    public void userClicksDropdownMenuOnClassNoAndClickAsEditClassAndInputAsNewClassNameAndEditStatus(String edit, String newClassName, String status) {
//        inputClass.SettingClass(3,edit,newClassName,status);
//    }
@And("User clicks dropdown menu on class and click {string} as edit class and input {string} as new class name and click {string} as new status")
public void userClicksDropdownMenuOnClassAndClickAsEditClassAndInputAsNewClassNameAndClickAsNewStatus(String Action, String NewClassName, String Status) {
    inputClass.SettingClass(Action,NewClassName,Status);
}
    @Then("User click submit and click Ok")
    public void userClickSubmitAndClickOk() {
    inputClass.clickButtonSubmit();
    }


    @And("User clicks dropdown menu on class and click {string} as delete class")
    public void userClicksDropdownMenuOnClassAndClickAsDeleteClass(String Delete) {
    inputClass.SettingClass(Delete,"","");
    }

    @Then("User click {string} as confirmation")
    public void userClickAsConfirmation(String confirm) {
    inputClass.clickButtonConfirmation(confirm);
    }
}
