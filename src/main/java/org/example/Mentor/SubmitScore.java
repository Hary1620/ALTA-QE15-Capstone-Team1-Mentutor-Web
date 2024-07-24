package org.example.Mentor;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubmitScore extends BasePage {
    public SubmitScore (WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "(//h1[@id='click-title'])[1]")
    private WebElement titleTask;
    @FindBy(xpath = "//div[@class='flex flex-row text-[7px] items-center md:text-[10px] lg:text-[15px] text-putih px-3 md:px-7 py-2 space-x-2 mb-1']")
    private WebElement submissionMentee;
    @FindBy(xpath = "//label[@class='hover:text-button px-4 text-sm text-abu cursor-pointer']")
    private WebElement editScore;
    @FindBy (id = "input-score")
    private WebElement inputScoreFields;
    @FindBy (id = "btn-submitEditScore")
    private WebElement submitScoreButton;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement okButton;
    @FindBy (xpath = "//label[@id='btn-close']")
    private WebElement closeButton;
    @FindBy (xpath = "//div[@class='swal2-success-ring']")
    private WebElement successSubmitScore;
    @FindBy(xpath = "//div[@class='swal2-icon swal2-error swal2-icon-show']")
    private WebElement failedSubmitScore;

    public void clickTitleTask(){
        scrollIntoView(titleTask);
        waitForElementVisible(titleTask);
        click(titleTask);
    }
    public void clickEditScore(){
        waitForElementVisible(submissionMentee);
        scrollIntoView(editScore);
        click(editScore);
    }
    public void clickInputScore(int score){
        inputScoreFields.clear();
        sendKeys(inputScoreFields, String.valueOf(score));
    }
    public void clickInputScoreString(String score){
        inputScoreFields.clear();
        sendKeys(inputScoreFields, score);
    }
    public void clickSubmitScore(){
        click(submitScoreButton);
    }
    public void clickOkButton(){
        click(okButton);
    }
    public void clickCloseButton(){
        click(closeButton);
    }
    public boolean verifySuccessSubmitScore(){
        waitForElementVisible(successSubmitScore);
        return isDisplayed(successSubmitScore);
    }
    public boolean verifyFailedSubmitScore(){
        waitForElementVisible(failedSubmitScore);
        return isDisplayed(failedSubmitScore);
    }
    public void clearColumn(){
        inputScoreFields.clear();
    }
}
