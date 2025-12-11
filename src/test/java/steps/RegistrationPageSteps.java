package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignInPage;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class RegistrationPageSteps {

    HomePage homePage = new HomePage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);
    SignInPage signInPage = new SignInPage(driver);

    public RegistrationPageSteps() throws IOException {
    }

    @Given("user navigates to the Registration Page")
    public void navigateToRegistrationPage() {
    homePage.clickHamburgerMenu();
    homePage.clickSignInPortal();
    }
    @When("user select the form of salutation")
    public void selectFormSalutation() {
        signInPage.clickRegistrationBtn();
        registrationPage.visibilityRegistrationPage();
    }
    @When("he completes all the blank fields")
    public void completeAllBlankFields() {
       registrationPage.selectSalutationDropdown("Ms.");
       registrationPage.sendKeysFirstName("noemi");
       registrationPage.sendKeysLastName("nini");
       registrationPage.sendKeysEmailId("test1234@gmail.com");
       registrationPage.sendKeysContactNumber("0656785678");
       registrationPage.sendKeysUserName("motan");
       registrationPage.sendKeysPassword("pisica");
    }
    @When("he clicks on submit button")
    public void clickOnSubmitButton() {
        registrationPage.submitButtonRegistration();
    }
    @Then("he will be registered successfully")

    public void registerSuccessfully() {
        String successfulMessage_registration= registrationPage.visibilitySuccessfulMessageRegistration();
        assertEquals("User Registered Successfully !!!", successfulMessage_registration);
    }

    @Then("then should be able to view the registration page")
    public void registrationView() {
        String actualRegistrationPage = registrationPage.visibilityRegistrationPage();
        assertEquals("User Registration Page", actualRegistrationPage);
    }
}
