package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @Given("User open the web Youtube")
    public void userOpenTheWebYoutube() {
        Assert.assertTrue(homePage.verifyHomePage());
    }

    @When("user input song {string} and click search")
    public void userInputAndClickSearch(String song) {
        homePage.inputFieldSearchMenu(song);
        homePage.clickButtonSearch();

    }

    @Then("user should be directed to the page")
    public void userShouldBeDirectedToThePage() {
        Assert.assertTrue(homePage.verifyvidiodisplay());
    }
}
