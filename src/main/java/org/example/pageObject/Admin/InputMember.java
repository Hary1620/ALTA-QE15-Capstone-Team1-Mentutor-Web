package org.example.pageObject.Admin;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class InputMember extends BasePage {
    public InputMember(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//h3[.='Input Member']")
    private WebElement BtnInputMemberPage;

    @FindBy (xpath = "//h1[@class='text-putih text-lg md:text-2xl font-medium']")
    private WebElement LabelInputMemberPage;

    @FindBy (xpath = "//input[@id='input-fullname']")
    private WebElement InputNameField;

    @FindBy (xpath = "//input[@id='input-email']")
    private WebElement InputEmailField;

    @FindBy (xpath = "//select[@id='dropdown-role']")
    private WebElement DropdownRole;

    @FindBy (xpath = "//option[@id='mentor']")
    private WebElement RoleMentor;

    @FindBy (xpath = "//option[@id='mentee']")
    private WebElement RoleMentee;

    @FindBy (xpath = "//select[@id='dropdown-class']")
    private WebElement DropdownClass;

    @FindBy (xpath = "//option[.='Pemrograman Java 1']")
    private WebElement ClassPemogramanJava;

    @FindBy (xpath = "//option[.='Data Sains']")
    private WebElement ClassDataSains;

    @FindBy (xpath = "//input[@id='input-password']")
    private WebElement InputPasswordField;

    @FindBy (xpath = "//button[@id='btn-addMember']")
    private WebElement BtnAddMember;


    public void clickButtonInputMember (){
        waitForElementVisible(BtnInputMemberPage);
        click(BtnInputMemberPage);
    }

    public boolean verifyInputMemberPage (){
        waitForElementVisible(LabelInputMemberPage);
        return isDisplayed(LabelInputMemberPage);
    }

    public void inputFullname (String Nama){sendKeys(InputNameField,Nama);}
    public void inputEmail (String Email){sendKeys(InputEmailField,Email);}
    public void inputPassword (String Password){sendKeys(InputPasswordField,Password);}

    public void inputRole(String role) {
        // Klik dropdown untuk membuka pilihan
        click(DropdownRole);
        waitForElementVisible(DropdownRole);
        scrollIntoView(DropdownRole);

        // Pilih role berdasarkan parameter
        if (role.equalsIgnoreCase("mentor")) {
            click(RoleMentor);
        } else if (role.equalsIgnoreCase("mentee")) {
            click(RoleMentee);
        }
    }

    public void inputClass(String kelas) {
        // Klik dropdown untuk membuka pilihan
        click(DropdownClass);
        waitForElementVisible(DropdownClass);
        scrollIntoView(DropdownClass);

        // Pilih role berdasarkan parameter
        if (kelas.equalsIgnoreCase("Pemograman Java")) {
            click(ClassPemogramanJava);
        } else if (kelas.equalsIgnoreCase("Data Sains")) {
            click(ClassDataSains);
        }
    }

    public void clickButtonAddMember (){
        waitForElementVisible(BtnAddMember);
        click(BtnAddMember);
    }

}
