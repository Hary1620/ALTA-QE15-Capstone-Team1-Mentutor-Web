package org.example.pageObject.Forum;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Forum extends BasePage {
    public Forum(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nav-forummentee")
    private WebElement forumMenteePage;

    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement validateForumMneteePage;

    @FindBy(id = "input-status")
    private WebElement inputStatusField;

    @FindBy(id = "btn-gbr")
    private WebElement btnUploadImage;

    @FindBy(id = "btn-send")
    private WebElement btnSendStatus;

   @FindBy(xpath = "//div[@class='space-y-8']/div[]/form[@class='mt-9 flex space-x-3']")
   private WebElement validateCommentfield;

    @FindBy(xpath = "(//input[@id='Input-comment'])[1]")
    private WebElement inputCommentField;

    @FindBy(id = "btn-sendComment")
    private WebElement btnSendComment;




    public void clickButtonForum (){
       waitForElementVisible(forumMenteePage);
        click(forumMenteePage);
    }

    public void validateForumPage(){
        waitForElementVisible(validateForumMneteePage);
    }

    public void postStatus(String status){
        inputStatusField.sendKeys(status);
        String path = "C:\\Users\\User\\IdeaProjects\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\File\\foto1.jpg";
        btnUploadImage.sendKeys(path);
        waitForElementVisible(btnSendStatus);
        click(btnSendStatus);
    }

    public void postComments(String comments){
        sendKeys(inputCommentField,comments);
        click(btnSendComment);
    }




}
