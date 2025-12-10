package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static utility.BrowserDriver.driver;

public class ContactPageSteps {
    ContactPage contactPage = new ContactPage(driver);
    HomePage homePage = new HomePage(driver);

    @Given("user navigates to the Contact Page")
    public void navigateToContactPage() {
        homePage.clickHamburgerMenu();
        contactPage.clickContactPage();
    }

    @When("user clicks on Read the full documentation link")
    public void clickDocumentationLink() {
        contactPage.clickLinkDocumentation();
    }

    @Then("he will be able to see the Github Page")
    public void githubPageView() {
        contactPage.visibilityHeadingPage();
        String actualGitHubPage = contactPage.visibilityHeadingPage();
        assertEquals("Quickstart", actualGitHubPage);
    }
}