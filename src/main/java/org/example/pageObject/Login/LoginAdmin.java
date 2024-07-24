package org.example.pageObject.Login;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAdmin extends BasePage {
    public LoginAdmin(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement fieldEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement fieldPassword;
    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//img[@alt='logo']")
    private WebElement labelProduct;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement buttonOke;
    @FindBy(xpath = "//a[.='Input Class']")
    private WebElement btninputclasspage;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement popUpMessageInvalid;
    @FindBy(xpath = "//p[.='password must be 8 characters']")
    private WebElement popUpInvalidPass;
    @FindBy(xpath = "//p[.='password must contain one uppercase']")
    private WebElement popUpInvalidPass1;
    @FindBy(xpath = "//p[.='password must contain one number']")
    private WebElement popUpInvalidPass2;
    @FindBy(xpath = "//p[.='password must contain one special character']")
    private WebElement popUpInvalidPass3;


    public void inputFieldEmail(String Email){
        sendKeys(fieldEmail,Email);
    }
    public void inputFieldPassword(String password){
        sendKeys(fieldPassword, password);
    }
    public void clickButtonLogin(){
        scrollIntoView(buttonLogin);
        waitForElementClickable(buttonLogin);
        click(buttonLogin);
    }
    public boolean verifyLabelProduct(){
        waitForElementVisible(labelProduct);
        click(buttonOke);
        return isDisplayed(labelProduct);
    }
    public boolean verifyLoginPage(){
        waitForElementVisible(fieldEmail);
        waitForElementVisible(fieldPassword);
        waitForElementVisible(buttonLogin);
        return isDisplayed(fieldEmail)&& isDisplayed(fieldPassword) && isDisplayed(buttonLogin);
    }

    public String popUpInvalidMessage (){
        waitForElementVisible(popUpMessageInvalid);
        return popUpMessageInvalid.getText();
    }

    public String popUpInvalidPassword (){
        waitForElementVisible(popUpInvalidPass);
        return popUpInvalidPass.getText();
    }

    public String popUpInvalidPassword1 (){
        waitForElementVisible(popUpInvalidPass1);
        return popUpInvalidPass1.getText();
    }

    public String popUpInvalidPassword2 (){
        waitForElementVisible(popUpInvalidPass2);
        return popUpInvalidPass2.getText();
    }

    public String popUpInvalidPassword3 (){
        waitForElementVisible(popUpInvalidPass3);
        return popUpInvalidPass3.getText();
    }

}
