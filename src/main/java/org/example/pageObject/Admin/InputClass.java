package org.example.pageObject.Admin;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.sql.DriverManager.getDriver;

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

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOk;

    @FindBy(xpath = "//p[.='Kalkulus']")
    private WebElement newClass1;

    @FindBy(xpath = "//input[@value='Kalkulus']")
    private WebElement inputNewClassName;

    @FindBy(id = "icon-options")
    private WebElement btnDropdown;

    @FindBy(id = "edit-click")
    private WebElement btnEdit;
    //--------------dropddown status-----------////////
    @FindBy(id = "dropdown-status")
    private WebElement btnDrodownStatus;

    @FindBy(id = "active")
    private WebElement statusActive;

    @FindBy(id = "non_active")
    private WebElement statusNonactive;
    //-------------------batas------------------/////////
    @FindBy(id = "btn-submitEditClass")
    private WebElement btnSubmitEditClass;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnOkEditSucces;

    @FindBy(id = "delete-click")
    private WebElement btnDelete;

    @FindBy(xpath = "//div[@class='swal2-actions']")
    private WebElement confirmdelete;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement btnYesDelete;

    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
    private WebElement btnCancelDelete;

//    private By getDynamicXpath(int index, String action) {
//        return By.xpath("//div[contains(text(), '" + index + "') and contains(text(), '" + action + "')]");
//    }


    public void clickButtonInputClass() {
        waitForElementVisible(ButtonClassPage);
        click(ButtonClassPage);
    }

    public boolean verifyInputClassPage() {
        waitForElementVisible(labelInputclasspage);
        return isDisplayed(labelInputclasspage);
    }

    public void inputfieldClassName(String ClassName) {
        waitForElementVisible(inputClassName);
        click(inputClassName);
        sendKeys(inputClassName, ClassName);
    }

    public void ClickButtonAdd() {
        click(btnAddclass);
    }

    public boolean verifyNewClassed() {
        click(btnOk);
        waitForElementVisible(newClass1);
        return isDisplayed(newClass1);
    }

    public void SettingClass(String action, String newClassName, String newStatus) {
        // Klik dropdown untuk membuka pilihan
        waitForElementVisible(newClass1);
        click(btnDropdown);
        waitForElementVisible(btnDropdown);
        scrollIntoView(btnDropdown);

        // Pilih berdasarkan parameter
        if (action.equalsIgnoreCase("edit kelas")) {
            click(btnEdit);

            // Tunggu hingga popup muncul
            waitForElementVisible(inputNewClassName);

            // Isi field classname
            inputNewClassName.clear();
            inputNewClassName.sendKeys(newClassName);

            // Klik dropdown status dan pilih status baru
            click(btnDrodownStatus);
            if (newStatus.equalsIgnoreCase("active")) {
                click(statusActive);
            } else if (newStatus.equalsIgnoreCase("non active")) {
                click(statusNonactive);
            }


        }
        else if (action.equalsIgnoreCase("delete")) {
            click(btnDelete);
            waitForElementVisible(confirmdelete);
        }

    }
    public void clickButtonSubmit () {
        waitForElementVisible(btnSubmitEditClass);
        click(btnSubmitEditClass);
        waitForElementVisible(btnOkEditSucces);
        click(btnOkEditSucces);
    }

    public void clickButtonConfirmation (String confrim) {
        waitForElementVisible(confirmdelete);
        if (confrim.equalsIgnoreCase("delete")) {
            click(btnYesDelete);
        } else if (confrim.equalsIgnoreCase("cancel")) {
            click(btnCancelDelete);
        }
    }


}


//    //-----------Edit & Delete class----------------------//
//
//    public void SettingClass( int index, String action, String newClassName, String newStatus) {
//        By dynamicXpath = getDynamicXpath(index, action);
//        // Klik dropdown untuk membuka pilihan
//        click(btnDropdown.findElement(dynamicXpath));
//        waitForElementVisible(btnDropdown);
//        scrollIntoView(btnDropdown);
//
//        // Pilih role berdasarkan parameter
//        if (action.equalsIgnoreCase("edit kelas")) {
//            click(btnEdit);
//            waitForElementVisible(inputClassName);
//            inputClassName.clear();
//            inputClassName.sendKeys(newClassName);
//
//            // Klik dropdown status dan pilih status baru
//            click(btnDrodownStatus);
//            if (newStatus.equalsIgnoreCase("active")) {
//                click(statusActive);
//            } else if (newStatus.equalsIgnoreCase("non active")) {
//                click(statusNonactive);
//            }
//
//            // Klik tombol submit
//            click(btnSubmitEditClass);
//            waitForElementVisible(btnOkEditSucces);
//            click(btnOkEditSucces);
//        } else if (action.equalsIgnoreCase("Delete class")) {
//            click(btnDelete);
//        }
//    }




