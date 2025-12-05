package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

import static utility.BrowserDriver.driver;

public class HomePageSteps {

//    HomePage homePage;//create object for the class
    HomePage homePage = new HomePage(driver);

    @Given("user navigates to the Login Page")
    public void navigateToLoginPage() throws Throwable {
       homePage.clickHamburgerMenu();
       homePage.clickSignInPortal();
    }
}

