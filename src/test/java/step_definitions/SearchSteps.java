package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CartPage;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    private WebDriver driver = Hooks.driver;

    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);

    @And("sort product icon is displayed")
    public void sortProductIconIsDisplayed() {
        Assert.assertTrue(productPage.verifySortProductSauceLabBackpackIsDisplayed());
    }

    @And("user click on sort product icon")
    public void userClickOnSortProductIcon() {
        productPage.clickSortProductSauceLabsbackpack();
    }

    @And("Choose sort Name \\(Z to A)")
    public void chooseSortNameZToA() {
        productPage.clickSortAtoZ();
    }

    @And("user click add to cart product {string} and product {string}")
    public void userClickAddToCartProductAndProduct(String product1, String product2) {
        productPage.clickAddToCartSauceLabsOnesie();
        productPage.clickAddToCartTShirtRed();
    }

    @And("click remove button on product {string}")
    public void clickRemoveButtonOnProduct(String arg0) {
        cartPage.clickRemove();
    }

    @Then("user click continue shopping button")
    public void userClickContinueShoppingButton() {
        cartPage.clickContinueShopping();
    }
}