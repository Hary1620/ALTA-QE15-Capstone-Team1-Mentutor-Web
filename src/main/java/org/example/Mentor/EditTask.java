package org.example.Mentor;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTask extends BasePage {
    public EditTask (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "(//label[@id='icon-options'])[1]")
    private WebElement iconOptions;
    @FindBy (xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//label[@class='hover:text-button px-4 pt-2 text-sm text-abu cursor-pointer']")
    private WebElement editButton;
    @FindBy(id = "input-title")
    private WebElement editTittle;
    @FindBy(id = "input-description")
    private WebElement editDesc;
    @FindBy (id = "input-due_date")
    private WebElement editDate;
    @FindBy(xpath = "//input[@id='upload-btn']")
    private WebElement editFile;
    @FindBy(xpath=  "//input[@id='upload-btn-image']")
    private WebElement editImages;
    @FindBy(id = "btn-submitTask")
    private WebElement submitButton;
    @FindBy (css = ".swal2-confirm")
    private WebElement okButton;
    @FindBy(css = ".btn-sm")
    private WebElement closeButton;
    @FindBy (xpath = "//div[@class='swal2-success-ring']")
    private WebElement successEditTask;
    @FindBy(xpath = "//div[@class='swal2-icon swal2-error swal2-icon-show']")
    private WebElement failedEditTask;

    public void clickIconOptions(){
        scrollIntoView(iconOptions);
        waitForElementVisible(iconOptions);
        click(iconOptions);
    }

    public void clickEditButton(){
        scrollIntoView(editButton);
        waitForElementVisible(editButton);
        click(editButton);
    }

    public void setEditTittle(String title){
        editTittle.clear();
        sendKeys(editTittle, title);
    }
    public void setEditDesc(String desc){
        editDesc.clear();
        sendKeys(editDesc, desc);
    }
    public void setEditDate(String date){
        editDate.clear();
        sendKeys(editDate, date);
    }
    public void setEditFile (){
        String path = "C:\\Users\\Public\\Documents\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\file\\soal.pdf";
        editFile.sendKeys(path);
    }
    public void setEditImages(){
        String path = "C:\\Users\\Public\\Documents\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\file\\contoh.jpg";
        editImages.sendKeys(path);
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
    public boolean verifySuccessEditTask(){
        waitForElementVisible(successEditTask);
        return isDisplayed(successEditTask);
    }
    public boolean verifyFailedEditTask(){
        waitForElementVisible(failedEditTask);
        return isDisplayed(failedEditTask);
    }
    public void clearCloumn(){
        editTittle.clear();
        editDesc.clear();
        editDate.clear();
    }

}
