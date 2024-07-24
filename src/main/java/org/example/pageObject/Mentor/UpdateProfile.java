package org.example.pageObject.Mentor;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfile extends BasePage {
    public UpdateProfile (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@id='nav-profile']")
    private WebElement profileButton;
    @FindBy(xpath = "//label[@class='h-8 w-8 md:h-10 md:w-10 bg-card shadow-md text-putih flex items-center justify-center rounded-[5px] cursor-pointer']")
    private WebElement pencilButton;
    @FindBy(xpath = "//input[@id='input-fullname']")
    private WebElement nameFields;
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailFields;
    @FindBy (xpath = "//input[@id='input-password']")
    private WebElement passwordFields;
    @FindBy(xpath = "//input[@id='btn-gbr']")
    private WebElement uploadImages;
    @FindBy(xpath = "//button[@id='btn-submitMentee']")
    private WebElement submitButton;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement okButton;
    @FindBy (xpath = "//label[@class='cursor-pointer btn-sm absolute right-2 top-2 text-putih border-white']")
    private WebElement closeButton;
    @FindBy (xpath = "//div[@class='swal2-success-ring']")
    private WebElement successEditProfile;
    @FindBy(xpath = "//div[@class='swal2-icon swal2-error swal2-icon-show']")
    private WebElement failedEditProfile;

    public void clickProfileButton(){
        scrollIntoView(profileButton);
        waitForElementClickable(profileButton);
        click(profileButton);
    }
    public void clickPencilButton(){
        scrollIntoView(pencilButton);
        waitForElementClickable(pencilButton);
        click(pencilButton);
    }
    public void inputName(String name){
        sendKeys(nameFields, name);
    }
    public void inputEmail (String email){
        sendKeys(emailFields, email);
    }
    public void inputPassword (String password){
        sendKeys(passwordFields, password);
    }
    public void inputImages(){
        String path = "C:\\Users\\Public\\Documents\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\file\\contoh.jpg";
        uploadImages.sendKeys(path);
    }
    public void clickSubmitButton(){
        click(submitButton);
    }
    public void clickOkButton(){
        click(okButton);
    }
    public void clickCloseButton(){
        click(closeButton);
    }
    public boolean verifySuccessEditProfile(){
        waitForElementVisible(successEditProfile);
        return isDisplayed(successEditProfile);
    }
    public boolean verifyFailedEditProfile(){
        waitForElementVisible(failedEditProfile);
        return isDisplayed(failedEditProfile);
    }
    public void clearColumn(){
        nameFields.clear();
        emailFields.clear();
        passwordFields.clear();
    }
}
