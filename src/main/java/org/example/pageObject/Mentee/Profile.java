package org.example.pageObject.Mentee;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile extends BasePage {
    public Profile(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "nav-profile")
    private WebElement profileMenteePage;

    @FindBy(xpath = "//h1[@class='text-putih text-lg lg:text-2xl font-medium mb-2']")
    private WebElement validateProfilePage;

    @FindBy(css = ".h-8")
    private WebElement editProfileButton;

    @FindBy(id = "input-fullname")
    private WebElement inputNameField;

    @FindBy(id = "input-email")
    private WebElement inputEmailField;

    @FindBy(id = "input-password")
    private WebElement inputPasswordField;

    @FindBy(xpath = "//input[@id='btn-gbr']")
    private WebElement btnUploadImage;

    @FindBy(id = "btn-submitMentee")
    private WebElement btnSubmitUpdate;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOke;

    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popUpMessageFailed;

    public void clickButtonProfile() {
        waitForElementVisible(profileMenteePage);
        click(profileMenteePage);
    }

    public void validateProfilePage(){
        waitForElementVisible(validateProfilePage);
    }

    public void editProfileMentee(String Name, String Email, String Password){
        click(editProfileButton);
        waitForElementVisible(inputEmailField);

        inputNameField.clear();
        inputNameField.sendKeys(Name);

        inputEmailField.clear();
        inputEmailField.sendKeys(Email);

        inputPasswordField.clear();
        inputPasswordField.sendKeys(Password);

    }
    public void uploadProfilePicture(){
        String path = "C:\\Users\\User\\IdeaProjects\\ALTA-QE15-Capstone-Team1-Mentutor-Web\\src\\main\\File\\foto1.jpg";
        btnUploadImage.sendKeys(path);
    }

    public void clickSubmitUpdateProfile(){
        scrollIntoView(btnSubmitUpdate);
        click(btnSubmitUpdate);
        waitForElementVisible(btnOke);
        click(btnOke);

    }
    public String popUpFailedMessage (){
        waitForElementVisible(popUpMessageFailed);
        return popUpMessageFailed.getText();
    }

}
