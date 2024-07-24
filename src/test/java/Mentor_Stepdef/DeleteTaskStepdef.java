package Mentor_Stepdef;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Mentor.DeleteTask;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DeleteTaskStepdef {
    private final WebDriver driver = Hooks.driver;
    DeleteTask deleteTask = new DeleteTask(driver);

    @And("Click icon options task and click delete")
    public void clickIconOptionsTaskAndClickDelete() throws InterruptedException {
        Thread.sleep(2000);
        deleteTask.clickIconOptions();
        deleteTask.clickDeleteOptions();
    }

    @Then("Click Yes Delete button")
    public void clickYesDeleteButton() {
        deleteTask.clickYesButton();
    }

    @And("Modal success delete task shows and click ok button")
    public void clickOkButton() {
        Assert.assertTrue(deleteTask.verifyDeleteTask());
        deleteTask.clickOkButton();
    }
}
