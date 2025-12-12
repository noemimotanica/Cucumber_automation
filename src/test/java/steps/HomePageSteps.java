package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;


public class HomePageSteps {

    //    HomePage homePage;//create object for the class
    HomePage homePage = new HomePage();

    public HomePageSteps() {
    }

    @Given("user navigates to the Login Page")
    public void navigateToLoginPage() throws Throwable {
       homePage.clickHamburgerMenu();
       homePage.clickSignInPortal();
    }
}

