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
}
