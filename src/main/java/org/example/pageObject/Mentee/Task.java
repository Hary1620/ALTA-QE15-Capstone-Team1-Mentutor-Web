package org.example.pageObject.Mentee;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task extends BasePage {
    public Task(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='nav-taskmentee']")
    private WebElement TaskMenteePage;

    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium ']")
    private WebElement ValidateTaskPage;

    @FindBy(id = "btn-submitTask")
    private WebElement BtnSubmitTask;

    @FindBy(id = "uploadfile-btn")
    private WebElement BtnChooseFile;

    @FindBy(xpath = "//button[@id='btn-submitTask']")
    private WebElement BtnConfirmSubmitTask;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement BtnOke;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement ErrorMessage;



    public void clickButtonTask() {
        waitForElementVisible(TaskMenteePage);
        click(TaskMenteePage);
    }

    public boolean verifyTaskPage() {
        waitForElementVisible(ValidateTaskPage);
        return isDisplayed(ValidateTaskPage);
    }

    public void setInputfile(){
       scrollIntoView(BtnSubmitTask);
       click(BtnSubmitTask);
        String path = "C:\\Users\\haryi\\IdeaProjects\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\File\\10_LM_Kanban.pdf";
        sendKeys(BtnChooseFile,path);

        click(BtnConfirmSubmitTask);
    }

    public void clickOkeButton(){
        waitForElementVisible(BtnOke);
        click(BtnOke);
    }

    public String popUpErrorMessage (){
        waitForElementVisible(ErrorMessage);
        return ErrorMessage.getText();
    }


}
