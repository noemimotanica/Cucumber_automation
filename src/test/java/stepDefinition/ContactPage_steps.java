package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ContactPage;

import static org.junit.Assert.assertEquals;
import static utility.BrowserDriver.driver;

public class ContactPage_steps {
    ContactPage contactPage = new ContactPage(driver);
//    ContactPage contactPage;

    @Given("user navigates to the Contact Page")
    public void user_navigates_to_the_contact_page() {
        contactPage.click_hamburger_menu();
        contactPage.click_contactPage();
    }

    @When("user clicks on Read the full documentation link")
    public void user_clicks_on_read_the_full_documentation_link() {
//
        contactPage.click_linkDocumentation();
//
    }

    @Then("he will be able to see the Github Page")
    public void he_will_be_able_to_see_the_github_page() {
//
        contactPage.visibility_headingPage();
//
        String actualGitHubPage = contactPage.visibility_headingPage();
        assertEquals("GitHub Pages documentation", actualGitHubPage);
//
    }
//
}