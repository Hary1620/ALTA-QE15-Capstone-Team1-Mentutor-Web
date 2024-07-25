package step_definitions.Mentor;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Mentor.SubmitScore;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SubmitScoreStepdef {
    private final WebDriver driver = Hooks.driver;
    SubmitScore submitScore = new SubmitScore(driver);

    @And("Click title task")
    public void clickTitleTask() throws InterruptedException {
        Thread.sleep(1000);
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
        Assert.assertTrue(submitScore.verifySuccessSubmitScore());
        submitScore.clickOkButton();
    }

    @And("Input score task empty")
    public void inputScoreTaskEmpty() {
        submitScore.clearColumn();
    }

    @And("Modal failed submit score shows and click ok button")
    public void modalFailedSubmitScoreShowsAndClickOkButton() {
        Assert.assertTrue(submitScore.verifyFailedSubmitScore());
        submitScore.clickOkButton();
    }

    @And("Input score task {string}")
    public void inputScoreTask(String score) {
        submitScore.clickInputScoreString(score);
    }
}
