package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.ContactPage;
import pages.HomePage;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ContactPageSteps {
    ContactPage contactPage = new ContactPage(driver);
    HomePage homePage = new HomePage(driver);

    public ContactPageSteps() throws IOException {

    }

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