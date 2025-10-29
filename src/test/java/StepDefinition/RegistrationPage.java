package StepDefinition;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.RegistrationPage.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.ProductCategoryPage.visibility_categoryPage;

public class RegistrationPage {


    @Then("then should be able to view the registration page")
        public void registrationView() {
            String actualRegistrationPage=visibility_RegistrationPage();
            assertEquals(actualRegistrationPage,"User Registration Page");

        }



    }

