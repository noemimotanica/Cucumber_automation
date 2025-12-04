package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.OnlineProductsPage;

import static utility.BrowserDriver.driver;

public class OnlineProductsSteps {

    HomePage homePage = new HomePage(driver);
    OnlineProductsPage onlineProductsPage = new OnlineProductsPage(driver);

    @Given("user navigates to the Online Products Page")
    public void navigateToOnlineProductsPage() {
        homePage.clickHamburgerMenu();
        onlineProductsPage.clickOnlineProductsMenu();
    }

    @When("user clicks on Sports Shoes arrow")
    public void clickOnSportsShoesArrow() {
        onlineProductsPage.clickFormalShoesDropdown();
    }

    @When("he will be able to view the shoe type")
    public void viewTheShoeType() {
        String actualShoeName= onlineProductsPage.visibilityShoesType();
        Assert.assertEquals("   Prestige Barlett Borgue",actualShoeName);
    }

    @Then("he will be able to set the size and the color")
    public void setTheSizeAndTheColor() {
          onlineProductsPage.selectShoeColor();
          onlineProductsPage.selectSizeAvailable();
    }


}


