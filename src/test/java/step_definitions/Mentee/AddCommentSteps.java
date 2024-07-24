package step_definitions.Mentee;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.example.pageObject.Forum.Forum;
import org.example.pageObject.Login.LoginAdmin;
import org.openqa.selenium.WebDriver;

public class AddCommentSteps {
    private final WebDriver driver = Hooks.driver;

    Forum forum= new Forum(driver);

    @And("User add new comment {string} and click send comment button")
    public void userAddNewCommentAndClickSendCommentButton(String comments) {
        forum.postComments(comments);
    }
}
