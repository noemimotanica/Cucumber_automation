package StepDefinition;

import io.cucumber.java.en.Given;
import pages.HomePage.*;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signIn_portal;
import static utility.BrowserDriver.driver;

public class BasePage {


    @Given("user navigates to the Login Page")
    public void user_navigates_to_the_login_page() throws Throwable {
        click_hamburger_menu();
        click_signIn_portal();

    }
}

