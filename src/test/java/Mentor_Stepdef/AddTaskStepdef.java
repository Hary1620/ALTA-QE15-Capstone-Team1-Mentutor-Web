package Mentor_Stepdef;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Mentor.AddTaskMentor;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddTaskStepdef {
    private final WebDriver driver = Hooks.driver;
   AddTaskMentor addTaskMentor = new AddTaskMentor(driver);

    @Then("Click task menu on sidebar")
    public void clickTaskMenuOnSidebar() {
        addTaskMentor.clickTaskButton();
    }

    @And("Input tittle {string} description {string} due to date {string} select image & file")
    public void inputTittleDescriptionDueToDateSelectImageFile(String title, String desc, String date) {
        addTaskMentor.setInputTitle(title);
        addTaskMentor.setInputDesc(desc);
        addTaskMentor.setInputDate(date);
        addTaskMentor.setInputFile();
        addTaskMentor.setInputImage();
    }

    @Then("Click add button")
    public void clickAddButton() {
        addTaskMentor.ClickAddButton();
    }

    @And("Modal success shows and click ok button")
    public void modalShowsAndClickOkButton() {
        Assert.assertTrue(addTaskMentor.verifySuccessAddTask());
        addTaskMentor.ClickOkButton();
    }

    @And("Required message shows")
    public void requiredMessageShows() {
        Assert.assertTrue(addTaskMentor.verifyRequired());
    }

    @And("Message maximal char show")
    public void messageMaximalCharShow() {
        Assert.assertTrue(addTaskMentor.verifyMaxChar());
    }
}
