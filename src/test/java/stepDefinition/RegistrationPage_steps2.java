package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;

import static org.junit.Assert.assertEquals;

public class RegistrationPage_steps2 {

    HomePage homePage;
    RegistrationPage registrationPage;
    SignInPage signInPage;

    @Given("user navigates to the Registration Page")
    public void user_navigates_to_the_registration_page() {
    homePage.click_hamburger_menu();
    homePage.click_signIn_portal();
    }
    @When("user select the form of salutation")
    public void user_select_the_form_of_salutation() {
        signInPage.click_registrationBtn();
        registrationPage.visibility_RegistrationPage();

    }
    @When("he completes all the blank fields")
    public void he_completes_all_the_blank_fields() {
       registrationPage.selectSalutation_dropdown("Ms.");
       registrationPage.sendKeys_firstname("noemi");
       registrationPage.sendKeys_lastname("nini");
       registrationPage.sendKeys_emailId("test1234@gmail.com");
       registrationPage.sendKeys_contactNumber("0656785678");
       registrationPage.sendKeys_userName("motan");
       registrationPage.sendKeys_password("pisica");

    }
    @When("he clicks on submit button")
    public void he_clicks_on_submit_button() {
        registrationPage.submitButton_registration();
    }
    @Then("he will be registered successfully")
    public void he_will_be_registered_successfully() {
        String successfulMessage_registration= registrationPage.visibility_successfulMessage_registration();
        assertEquals("User Registered Successfully !!!", successfulMessage_registration);

    }

}
