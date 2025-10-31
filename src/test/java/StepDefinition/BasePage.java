package StepDefinition;

import io.cucumber.java.en.Given;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import pages.HomePage;
import pages.HomePage.*;

//import static pages.HomePage.click_hamburger_menu;
//import static pages.HomePage.click_signIn_portal;
import static utility.BrowserDriver.driver;

public class BasePage {
    HomePage homePage;//create object for the class


    @Given("user navigates to the Login Page")
    public void user_navigates_to_the_login_page() throws Throwable {
       homePage.click_hamburger_menu();
       homePage.click_signIn_portal();

//       click_hamburger_menu();
//        click_signIn_portal();

    }
}

