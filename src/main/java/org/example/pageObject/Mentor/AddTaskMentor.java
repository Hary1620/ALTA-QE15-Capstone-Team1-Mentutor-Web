package org.example.pageObject.Mentor;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTaskMentor extends BasePage {
    public AddTaskMentor (WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#nav-inputtask")
    private WebElement taskButton;
    @FindBy(xpath = "//input[@name='title']")
    private WebElement inputTitle;
    @FindBy(xpath = "//textarea[@id='input-desc']")
    private WebElement inputDesc;
    @FindBy(xpath = "//input[@id='input-date']")
    private WebElement inputDate;
    @FindBy(xpath = "//input[@id='uploadfile-btn']")
    private WebElement inputFile;
    @FindBy(xpath = "//input[@id='uploadimage-btn']")
    private WebElement inputImage;
    @FindBy(xpath = "//button[@id='input-file']")
    private WebElement addButton;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement okButton;
    @FindBy (xpath = "//div[@class='swal2-success-ring']")
    private WebElement successAddTask;
    @FindBy (xpath = "//p[.='Title is required']")
    private WebElement requiredTitle;
    @FindBy(xpath = "//p[.='Description is required']")
    private WebElement requiredDesc;
    @FindBy (xpath = "//p[.='Due_date is required']")
    private WebElement requiredDate;
    @FindBy (xpath = "//p[.='Email must not exceed 255 characters']")
    private WebElement maxTitle;
    @FindBy(xpath = "//p[.='Description must not exceed 255 characters']")
    private WebElement maxDesc;

    public void clickTaskButton(){
        scrollIntoView(taskButton);
        waitForElementVisible(taskButton);
        click(taskButton);
    }

    public void setInputTitle(String title){
        sendKeys(inputTitle, title);
    }
    public void setInputDesc(String desc){
        sendKeys(inputDesc, desc);
    }
    public void setInputDate(String date){
        sendKeys(inputDate, date);
    }
    public void setInputFile(){
        String path = "C:\\Users\\haryi\\IdeaProjects\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\File\\soal.pdf";
        sendKeys(inputFile, path);
    }
    public void setInputImage(){
        String path = "C:\\Users\\haryi\\IdeaProjects\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\File\\contoh.jpg";
        sendKeys(inputImage, path);
    }
    public void ClickAddButton(){
        scrollIntoView(addButton);
        waitForElementClickable(addButton);
        click(addButton);
    }
    public void ClickOkButton(){
        scrollIntoView(okButton);
        waitForElementClickable(okButton);
        click(okButton);
    }
    public boolean verifySuccessAddTask(){
        waitForElementVisible(successAddTask);
        return isDisplayed(successAddTask);
    }
    public boolean verifyRequired(){
        waitForElementVisible(requiredTitle);
        waitForElementVisible(requiredDesc);
        waitForElementVisible(requiredDate);
        return isDisplayed(requiredTitle) && isDisplayed(requiredDesc) && isDisplayed(requiredDate);
    }
    public boolean verifyMaxChar(){
        waitForElementVisible(maxTitle);
        waitForElementVisible(maxDesc);
        return isDisplayed(maxTitle) && isDisplayed(maxDesc);
    }
}
