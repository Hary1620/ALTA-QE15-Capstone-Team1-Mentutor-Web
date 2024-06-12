package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) { super (driver);}

    @FindBy (id = "logo-icon")
    private WebElement youtubeIcon;

    @FindBy (xpath = "//ytd-searchbox[@id='search']")
    private WebElement searchForm;

    @FindBy (id = "search-icon-legacy")
    private WebElement buttonSearch;

    @FindBy (id = "dismissible")
    private  WebElement vidioPage;

    public boolean verifyHomePage(){
        waitForElementVisible(youtubeIcon);
        return isDisplayed(youtubeIcon);
    }

    public void inputFieldSearchMenu(String song){
        sendKeys(searchForm, song);
    }
    public void clickButtonSearch(){
//        scrollIntoView(buttonSearch);
//        waitForElementClickable(buttonSearch);
        click(buttonSearch);
    }

    public boolean verifyvidiodisplay(){
        waitForElementVisible(vidioPage);
        return isDisplayed(vidioPage);
    }



}
