package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SignInPage;

import static utility.BrowserDriver.driver;


public class SignInPage_steps {

//    SignInPage signInPage;
      SignInPage signInPage=new SignInPage(driver);

//    @When("user successfully enters the credentials")
//    public void user_successfully_enters_the_login_details() {
//    signInPage.sendKeys_username();
//    signInPage.sendKeys_password();
//    signInPage.click_loginBtn();
//       sendKeys_username();
//       sendKeys_password();
//       click_loginBtn();

//    }

    @When("user clicks on new registration button")
    public void user_clicks_on_new_registration_button() {
        signInPage.click_registrationBtn();



    }

    @When("user successfully enters the credentials")
    public void userSuccessfullyEntersTheCredentials(DataTable table) {
//     List<List<String>> data  = table.raw();
//        System.out.println(data.get(0).get(0));
//        System.out.println(data.get(0).get(1));
        signInPage.sendKeys_username();
        signInPage.sendKeys_password();
        signInPage.click_loginBtn();

    }
}
