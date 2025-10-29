package StepDefinition;

import io.cucumber.java.en.When;
import static pages.SignInPage.*;

public class SignInPage {

    @When("user successfully enters the login details")
    public void user_successfully_enters_the_login_details() {
       sendKeys_username();
       sendKeys_password();
       click_loginBtn();

    }



    @When("user clicks on new registration button")
    public void user_clicks_on_new_registration_button() {
          click_registrationBtn();

    }
}
