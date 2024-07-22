package org.example.pageObject.Admin;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InputClass extends BasePage {
    public InputClass(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Input Class']")
    private WebElement ButtonClassPage;

    @FindBy(xpath = "//div[@id='nav-input']")
    private WebElement labelInputclasspage;

    @FindBy(id = "input-class")
    private WebElement inputClassName;

    @FindBy(xpath = "//button[@id='btn-addClass']")
    private WebElement btnAddclass;




    public void clickButtonInputClass () {
        waitForElementVisible(ButtonClassPage);
        click(ButtonClassPage);

    }

    public boolean verifyInputClassPage () {
        waitForElementVisible(labelInputclasspage);
        return isDisplayed(labelInputclasspage);
    }

    public void inputfieldClassName(String ClassName) {
        waitForElementVisible(inputClassName);
        click(inputClassName);
        sendKeys(inputClassName,ClassName);}
    public void ClickButtonAdd(){
        click(btnAddclass);
    }
}
