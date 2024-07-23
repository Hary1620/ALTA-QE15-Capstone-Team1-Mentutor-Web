package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Mentor.DeleteTask;
import org.openqa.selenium.WebDriver;

public class DeleteTaskStepdef {
    private final WebDriver driver = Hooks.driver;
    DeleteTask deleteTask = new DeleteTask(driver);

    @And("Click icon options task and click delete")
    public void clickIconOptionsTaskAndClickDelete() {
        deleteTask.clickIconOptions();
        deleteTask.clickDeleteOptions();
    }

    @Then("Click Yes Delete button")
    public void clickYesDeleteButton() {
        deleteTask.clickYesButton();
    }

    @And("Click ok button")
    public void clickOkButton() {
        deleteTask.clickOkButton();
    }
}
