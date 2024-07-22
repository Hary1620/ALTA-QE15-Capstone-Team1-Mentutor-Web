package step_definitions.Admin;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.example.pageObject.Admin.InputClass;
import org.example.pageObject.Login.LoginAdmin;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddNewClassSteps {
    private final WebDriver driver = Hooks.driver;
   InputClass inputClass = new InputClass(driver);

    @And("User click input class on the sidebar menu")
    public void userClickInputClassOnTheSidebarMenu() {
        inputClass.clickButtonInputClass();
    }

    @And("User should be directed to Add class page")
    public void userShouldBeDirectedToAddClassPage() {
        Assert.assertTrue(inputClass.verifyInputClassPage());
    }

    @And("User input {string} as Class Name")
    public void userInputAsClassName(String ClassName) {
        inputClass.inputfieldClassName(ClassName);
    }

    @And("User click add")
    public void userClickAdd() {
        inputClass.ClickButtonAdd();
    }
}
