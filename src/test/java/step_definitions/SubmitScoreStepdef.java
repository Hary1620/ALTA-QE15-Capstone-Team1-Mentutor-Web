package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Mentor.SubmitScore;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class SubmitScoreStepdef {
    private final WebDriver driver = Hooks.driver;
    SubmitScore submitScore = new SubmitScore(driver);

    @And("Click title task")
    public void clickTitleTask() {
        submitScore.clickTitleTask();
    }

    @Then("Click edit score at submission column")
    public void clickEditScoreAtSubmissionColumn() {
        submitScore.clickEditScore();
    }

    @And("Input score task {int}")
    public void inputScoreTask(String score) {
        submitScore.clickInputScore(score);
    }

    @Then("Click submit button score and click ok button")
    public void clickSubmitButtonScoreAndClickOkButton() {
        submitScore.clickSubmitScore();
        submitScore.clickOkButton();
    }

    @And("Click close button edit score")
    public void clickCloseButtonEditScore() {
        submitScore.clickCloseButton();
    }
}
