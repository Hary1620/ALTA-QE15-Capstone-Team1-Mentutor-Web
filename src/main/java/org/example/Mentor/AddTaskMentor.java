package org.example.Mentor;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTaskMentor extends BasePage {
    public AddTaskMentor (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@id='nav-inputtask']")
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
    private WebElement addButon;

    public void clickTaskButton(){
        scrollIntoView(taskButton);
        waitForElementClickable(taskButton);
        click(taskButton);
    }
    public boolean verifyInputTaskPage(){
        waitForElementVisible(inputTitle);
        waitForElementVisible(inputDate);
        waitForElementVisible(inputFile);
        waitForElementVisible(inputImage);
        return isDisplayed(inputTitle) && isDisplayed(inputDate) && isDisplayed(inputFile) && isDisplayed(inputImage) && isDisplayed(inputDesc);
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
        String path = "Users/Public/Documents/ALTA-QE15-Capstone-Team1-Mentutor-Web/src/main/file/soal.pdf";
        sendKeys(inputFile, path);
    }
    public void setInputImage(){
        String path = "Users/Public/Documents/ALTA-QE15-Capstone-Team1-Mentutor-Web/src/main/file/contoh.jpg";
        sendKeys(inputImage, path);
    }
    public void ClickAddButon(){
        scrollIntoView(addButon);
        waitForElementClickable(addButon);
        click(addButon);
    }

}
