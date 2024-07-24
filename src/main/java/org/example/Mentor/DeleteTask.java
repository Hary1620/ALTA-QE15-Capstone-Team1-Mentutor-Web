package org.example.Mentor;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteTask extends BasePage {
    public DeleteTask (WebDriver driver){
        super(driver);
    }
    @FindBy(xpath= "(//label[@id='icon-options'])[1]")
    private WebElement iconOptions;
    @FindBy(xpath = "(//li[@id='delete-click'])[1]")
    private WebElement deleteOptions;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement yesButton;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okButton;
    @FindBy (xpath = "//div[@class='swal2-success-ring']")
    private WebElement successDeleteTask;

    public void clickIconOptions(){
        scrollIntoView(iconOptions);
        waitForElementVisible(iconOptions);
        click(iconOptions);
    }
    public void clickDeleteOptions(){
        scrollIntoView(deleteOptions);
        waitForElementVisible(deleteOptions);
        click(deleteOptions);
    }
    public void clickYesButton(){
        waitForElementVisible(yesButton);
        click(yesButton);
    }
    public void clickOkButton(){
        waitForElementVisible(okButton);
        click(okButton);
    }
    public boolean verifyDeleteTask(){
        waitForElementVisible(successDeleteTask);
        return isDisplayed(successDeleteTask);
    }
}
