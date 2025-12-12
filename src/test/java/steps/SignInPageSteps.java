package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.SignInPage;
import java.util.List;


public class SignInPageSteps {

      SignInPage signInPage=new SignInPage();

    public SignInPageSteps() {
    }

    @When("user clicks on new registration button")
    public void clicksRegistrationButton() {
        signInPage.clickRegistrationBtn();
    }

    @When("user successfully enters the credentials")
    public void enterCredentialsSuccessfully(DataTable table) {
        List<List<String>> data = table.asLists();

        String username = data.get(1).get(0);  // Alex
        String password = data.get(1).get(2);  // pisica123

        signInPage.sendKeysUsername(username);
        signInPage.sendKeysPassword(password);
        signInPage.clickLoginBtn();
    }
}
