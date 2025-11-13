package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.OnlineProductsPage;

import static utility.BrowserDriver.driver;

public class OnlineProducts_steps {

//    HomePage homePage;
//    OnlineProductsPage onlineProductsPage;
    HomePage homePage = new HomePage(driver);
    OnlineProductsPage onlineProductsPage = new OnlineProductsPage(driver);

    @Given("user navigates to the Online Products Page")
    public void user_navigates_to_the_online_products_page() {
        homePage.click_hamburger_menu();
        onlineProductsPage.click_onlineProducts_menu();
    }


    @When("user clicks on Sports Shoes arrow")
    public void user_clicks_on_sports_shoes_arrow() {
        onlineProductsPage.click_formal_shoes_dropdown();

    }

    @When("he will be able to view the shoe type")
    public void he_will_be_able_to_view_the_shoe_type() {
        String actualShoeName= onlineProductsPage.visibility_shoesType();
        Assert.assertEquals("   Prestige Barlett Borgue",actualShoeName);

    }

    @Then("he will be able to set the size and the color")
    public void he_will_be_able_to_set_the_size_and_the_color() {
          onlineProductsPage.select_shoeColor();
          onlineProductsPage.select_sizeAvailable();
    }


}


