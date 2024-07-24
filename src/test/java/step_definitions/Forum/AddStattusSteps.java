package step_definitions.Forum;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.example.pageObject.Forum.Forum;
import org.openqa.selenium.WebDriver;
import org.example.pageObject.Login.LoginAdmin;

public class AddStattusSteps {
    private final WebDriver driver = Hooks.driver;
    Forum forum = new Forum(driver);

    @And("User click forum page")
    public void userClickForumPage() {
        forum.clickButtonForum();
        forum.validateForumPage();
    }

    @And("User add new status {string} and user upload image file and user click send status")
    public void userAddNewStatusAndUserUploadImageFileAndUserClickSendStatus(String status) {
        forum.postStatus(status);
    }
}
