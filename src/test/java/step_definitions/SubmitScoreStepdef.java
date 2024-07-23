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
    public void clickTitleTask() throws InterruptedException {
        Thread.sleep(2000);
        submitScore.clickTitleTask();
    }

    @Then("Click edit score at submission column")
    public void clickEditScoreAtSubmissionColumn() {
        submitScore.clickEditScore();
    }

    @And("Input score task {int}")
    public void inputScoreTask(int score) {
        submitScore.clickInputScore(score);
    }

    @Then("Click submit button")
    public void clickSubmitButtonScoreAndClickOkButton() {
        submitScore.clickSubmitScore();
    }

    @And("Click close button edit score")
    public void clickCloseButtonEditScore() {
        submitScore.clickCloseButton();
    }

    @And("Modal success submit score shows and click ok button")
    public void modalSuccessSubmitScoreShowsAndClickOkButton() {
//        Assert.assertTrue(submitScore.verifySuccessSubmitScore());
//        submitScore.clickOkButton();
    }
}
