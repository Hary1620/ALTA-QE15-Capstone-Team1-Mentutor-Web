package step_definitions.Mentor;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Mentor.EditTask;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditTaskStepdef {
    private final WebDriver driver = Hooks.driver;
    EditTask editTask = new EditTask(driver);

    @And("Click icon options task and edit")
    public void clickIconOptionsTaskAndEdit() throws InterruptedException {
        Thread.sleep(1000);
        editTask.clickIconOptions();
        editTask.clickEditButton();
    }

    @Then("Input title {string} description {string} due date {string} file and images")
    public void inputTitleDescriptionDueDateFileAndImages(String title, String desc, String date) {
        editTask.setEditTittle(title);
        editTask.setEditDesc(desc);
        editTask.setEditDate(date);
        editTask.setEditFile();
        editTask.setEditImages();
    }

    @And("Click submit button task")
    public void clickSubmitButtonTask() {
        editTask.clickSubmitButton();

    }

    @Then("Click close button")
    public void clickCloseButton() {
        editTask.clickCloseButton();
    }

    @And("Modal success edit shows and click ok button")
    public void modalSuccessEditShowsAndClickOkButton() {
        Assert.assertTrue(editTask.verifySuccessEditTask());
        editTask.clickOkButton();
    }

    @Then("Clear fill column")
    public void clearFillColumn() {
        editTask.clearCloumn();
    }

    @And("Modal failed edit shows and click ok button")
    public void modalFailedEditShowsAndClickOkButton() {
        Assert.assertTrue(editTask.verifyFailedEditTask());
        editTask.clickOkButton();
    }
}
