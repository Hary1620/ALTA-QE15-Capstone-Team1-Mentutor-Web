package org.example.Mentor;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentStatus extends BasePage {
    public CommentStatus (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@id='nav-forummentor']")
    private WebElement forumButton;
    @FindBy(xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[2]//input[@id='Input-comment']")
    private WebElement commentFields;
    @FindBy (xpath = "//div[@class='mt-[3rem] mb-[2rem] space-y-6']/div[1]//button[@id='btn-sendComment']")
    private WebElement sendButton;

    public void clickForumButton(){
        scrollIntoView(forumButton);
        waitForElementClickable(forumButton);
        click(forumButton);
    }
    public void inputCommentFields(String caption){
        sendKeys(commentFields, caption);
    }
    public void clickSendButton(){
        click(sendButton);
    }
}
