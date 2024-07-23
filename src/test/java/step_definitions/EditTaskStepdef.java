package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Mentor.EditTask;
import org.example.pageObject.Login;
import org.openqa.selenium.WebDriver;

public class EditTaskStepdef {
    private final WebDriver driver = Hooks.driver;
    EditTask editTask = new EditTask(driver);

    @And("Click icon options task and edit")
    public void clickIconOptionsTaskAndEdit() {
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

    @And("Click submit button task and click ok button")
    public void clickSubmitButtonTaskAndClickOkButton() {
        editTask.clickSubmitButton();
        editTask.clickOkButton();
    }

    @Then("Click close button")
    public void clickCloseButton() {
        editTask.clickCloseButton();
    }
}
