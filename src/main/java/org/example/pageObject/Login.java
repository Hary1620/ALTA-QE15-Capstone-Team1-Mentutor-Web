package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
    public Login(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputPassword;
    @FindBy (xpath = "//button[@id='btn-login']")
    private WebElement loginButton;
    @FindBy (xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement okButton;

    public boolean verifyLoginMentorPage(){
        waitForElementVisible(inputEmail);
        waitForElementVisible(inputPassword);
        waitForElementVisible(loginButton);
        return isDisplayed(inputEmail) && isDisplayed(inputPassword) && isDisplayed(loginButton);
    }
    public void inputemail(String email){
        sendKeys(inputEmail, email);
    }
    public void inputPassword(String password){
        sendKeys(inputPassword, password);
    }
    public void clicklLoginButton(){
        scrollIntoView(loginButton);
        waitForElementClickable(loginButton);
        click(loginButton);
    }
    public void clickOKButton(){
        waitForElementVisible(okButton);
        click(okButton);
    }
}
