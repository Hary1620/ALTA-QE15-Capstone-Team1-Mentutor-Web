package step_definitions.Mentee;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Login.LoginAdmin;
import org.example.pageObject.Mentee.Task;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AssignTaskSteps {
    private final WebDriver driver = Hooks.driver;
    Task task = new Task(driver);

    @And("User click Task page")
    public void userClickTaskPage() {
        task.clickButtonTask();
        task.verifyTaskPage();
    }

    @And("user click submit task and select file task and click submit")
    public void userClickSubmitTaskAndSelectFileTaskAndClickSubmit() {
        task.setInputfile();
    }

    @Then("click ok button")
    public void clickOkButton() {
        task.clickOkeButton();
    }

    @And("System wil show up error message {string}")
    public void systemWilShowUpErrorMessage(String message) {
        String actualMessage = task.popUpErrorMessage();
        Assert.assertEquals(message, actualMessage);
    }
}
