package StepDefinition;

import io.cucumber.java.en.When;
import pages.HomePage;

import static pages.SignInPage.*;
//import  static pages.*;
import static utility.BrowserDriver.driver;

public class SignInPage {
    HomePage homePage;
    SignInPage signInPage;

    @When("user successfully enters the <username> and <password>")
    public void user_successfully_enters_the_login_details() {
//   signInPage.

//       sendKeys_username();
//       sendKeys_password();
//       click_loginBtn();

    }

    @When("user clicks on new registration button")
    public void user_clicks_on_new_registration_button() {
        
//          click_registrationBtn();

    }
}
