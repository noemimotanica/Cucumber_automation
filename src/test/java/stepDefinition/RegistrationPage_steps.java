package stepDefinition;
import io.cucumber.java.en.Then;
import pages.RegistrationPage;

import static org.junit.Assert.assertEquals;
import static utility.BrowserDriver.driver;
//import static pages.ProductCategoryPage.visibility_categoryPage;



public class RegistrationPage_steps {
//   RegistrationPage registrationPage;
    RegistrationPage registrationPage = new RegistrationPage(driver);



    @Then("then should be able to view the registration page")
        public void registrationView() {
//       registrationPage.visibility_RegistrationPage();

           String actualRegistrationPage=registrationPage.visibility_RegistrationPage();
           assertEquals("User Registration Page",actualRegistrationPage);

        }

    }

