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
    @FindBy(xpath = "//div[@class='h-screen ml-[50px] md:ml-[200px] lg:ml-[320px] relative p-6 md:px-14 md:pt-10 md:pb-10 ']/form[1]//div[@class='dropdown dropdown-bottom dropdown-end']")
    private WebElement iconOptions;
    @FindBy(id = "delete-click")
    private WebElement deleteOptions;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement yesButton;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement okButton;

    public void clickIconOptions(){
        scrollIntoView(iconOptions);
        waitForElementClickable(iconOptions);
        waitForElementVisible(iconOptions);
        click(iconOptions);
    }
    public void clickDeleteOptions(){
        scrollIntoView(deleteOptions);
        waitForElementClickable(deleteOptions);
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
}
