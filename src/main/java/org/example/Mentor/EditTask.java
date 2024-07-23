package org.example.Mentor;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTask extends BasePage {
    public EditTask (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//div[@class='dropdown dropdown-bottom dropdown-end']")
    private WebElement iconOptions;
    @FindBy (xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//label[@class='hover:text-button px-4 pt-2 text-sm text-abu cursor-pointer']")
    private WebElement editButton;
    @FindBy(id = "input-title")
    private WebElement editTittle;
    @FindBy(id = "input-description")
    private WebElement editDesc;
    @FindBy (id = "input-due_date")
    private WebElement editDate;
    @FindBy(css = "[for='upload-btn']")
    private WebElement editFile;
    @FindBy(id = "[for='upload-btn-image']")
    private WebElement editImages;
    @FindBy(id = "btn-submitTask")
    private WebElement submitButton;
    @FindBy (css = ".swal2-confirm")
    private WebElement okButton;
    @FindBy(css = ".btn-sm")
    private WebElement closeButton;

    public void clickIconOptions(){
        scrollIntoView(iconOptions);
        waitForElementClickable(iconOptions);
        waitForElementVisible(iconOptions);
        click(iconOptions);
    }

    public void clickEditButton(){
        scrollIntoView(editButton);
        waitForElementClickable(editButton);
        click(editButton);
    }

    public void setEditTittle(String title){
        sendKeys(editTittle, title);
    }
    public void setEditDesc(String desc){
        sendKeys(editDesc, desc);
    }
    public void setEditDate(String date){
        sendKeys(editDate, date);
    }
    public void setEditFile (){
        String path = "C:/Users/Public/Documents/ALTA-QE15-Capstone-Team1-Mentutor-Web/src/main/file/soal.pdf";
        sendKeys(editFile, path);
    }
    public void setEditImages(){
        String path = "C:/Users/Public/Documents/ALTA-QE15-Capstone-Team1-Mentutor-Web/src/main/file/contoh.jpg";
        sendKeys(editImages, path);
    }
    public void clickSubmitButton(){
        click(submitButton);
    }
    public void clickOkButton(){
        waitForElementVisible(okButton);
        click(okButton);
    }
    public void clickCloseButton(){
        waitForElementVisible(closeButton);
        click(closeButton);
    }
}
