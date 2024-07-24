package step_definitions.Mentor;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.Mentor.CommentStatus;
import org.openqa.selenium.WebDriver;

public class CommentStatusStepdef {
    private final WebDriver driver = Hooks.driver;
    CommentStatus commentStatus = new CommentStatus(driver);

    @Then("Click forum menu on sidebar")
    public void clickForumMenuOnSidebar() {
        commentStatus.clickForumButton();
    }

    @And("Input comment on status mentee {string}")
    public void inputCommentOnStatusMentee(String caption) {
        commentStatus.inputCommentFields(caption);
    }

    @Then("Click send button")
    public void clickSendButton() {
        commentStatus.clickSendButton();
    }
}
