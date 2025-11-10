package stepDefinition;

import io.cucumber.java.en.When;
import pages.SignInPage;

//import  static pages.*;


public class SignInPage_steps {

    SignInPage signInPage;

    @When("user successfully enters the credentials")
    public void user_successfully_enters_the_login_details() {
    signInPage.sendKeys_username();
    signInPage.sendKeys_password();
    signInPage.click_loginBtn();
//       sendKeys_username();
//       sendKeys_password();
//       click_loginBtn();

    }

    @When("user clicks on new registration button")
    public void user_clicks_on_new_registration_button() {
        signInPage.click_registrationBtn();
        
//          click_registrationBtn();

    }
}
