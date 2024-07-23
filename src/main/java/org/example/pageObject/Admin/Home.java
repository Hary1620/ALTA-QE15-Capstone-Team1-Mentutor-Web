package org.example.pageObject.Admin;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {
    public Home(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[.='Home']")
    private WebElement HomePage;

    @FindBy(xpath = "//div[.='4Ahmad reno setyawanahmadrenooo@gmail.commenteeManajemen Basis DataEditDelete']")
    private WebElement validateUser;

    @FindBy(xpath = "//div[6]/div[@class='dropdown dropdown-end ']")
    private WebElement BtnDropdown;

    @FindBy(xpath = "//div[6]//label[@class='hover:text-button px-4 pt-2 text-sm text-putih cursor-pointer']")
    private WebElement EditUser;

    @FindBy(xpath = "//form[@class='flex flex-col md:p-9 lg:p-9 gap-4 ']")
    private WebElement formEditUser;

    @FindBy(id = "input-fullname")
    private WebElement InputFullName;

    @FindBy(id = "input-email")
    private WebElement InputEmail;

    @FindBy(id = "input-password")
    private WebElement InputPassword;

    @FindBy(id = "dropdown-class")
    private WebElement DropDownClass;

    @FindBy(xpath = "//option[.='Back End']")
    private WebElement OptionClass1;

    @FindBy(xpath = "//option[.='Data Sains']")
    private WebElement OptionClass2;

    @FindBy(id = "btn-submitAdmin")
    private WebElement BtnSubmit;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement BtnOkeSuccses;

    @FindBy(xpath = "//div[6]//li[@id='delete-click']")
    private WebElement DeleteUser;

    @FindBy(xpath = "//div[@class='swal2-actions']")
    private WebElement ConfirmDelete;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement BtnYesDelete;

    @FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
    private WebElement BtnCancel;


    public void SettingUser(String action, String newName, String newStatus, String newEmail,String newPassword) {
        // Klik dropdown untuk membuka pilihan
        waitForElementVisible(validateUser);
        click(BtnDropdown);
        waitForElementVisible(BtnDropdown);
        scrollIntoView(BtnDropdown);

        // Pilih berdasarkan parameter
        if (action.equalsIgnoreCase("Edit User")) {
            click(EditUser);

            // Tunggu hingga popup muncul
            waitForElementVisible(formEditUser);
            waitForElementVisible(InputFullName);
            waitForElementVisible(InputEmail);
            waitForElementVisible(InputPassword);

            // Isi field classname
          InputFullName.clear();
          InputFullName.sendKeys(newName);

          InputEmail.clear();
          InputEmail.sendKeys(newEmail);

          InputPassword.clear();
          InputPassword.sendKeys(newPassword);

            // Klik dropdown class dan pilih status baru
            click(DropDownClass);
            if (newStatus.equalsIgnoreCase("Back End")) {
                click(OptionClass1);
            } else if (newStatus.equalsIgnoreCase("Data Sains")) {
                click(OptionClass2);
            }


        }
        else if (action.equalsIgnoreCase("delete")) {
            click(DeleteUser);
            waitForElementVisible(ConfirmDelete);
        }

    }
    public void clickButtonSubmit () {
        waitForElementVisible(BtnSubmit);
        click(BtnSubmit);
        waitForElementVisible(BtnOkeSuccses);
        click(BtnOkeSuccses);
    }

    public void clickButtonConfirmation (String confrim) {
        waitForElementVisible(ConfirmDelete);
        if (confrim.equalsIgnoreCase("delete")) {
            click(BtnYesDelete);
        } else if (confrim.equalsIgnoreCase("cancel")) {
            click(BtnCancel);
        }
    }











}
