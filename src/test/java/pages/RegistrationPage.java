package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationPage {


    private final WebDriver driver;

    @FindBy(xpath = "//h1[normalize-space()='User Registration Page']")
    WebElement registration_heading_xpath;

    @FindBy(xpath = "//select[@id='Salutation']")
    WebElement salutationDropdown_xpath;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstName_field;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastName_field;

    @FindBy(xpath = "//input[@id='contactNumber']")
    WebElement contactNumber;

    @FindBy(xpath = "//input[@id='emailId']")
    WebElement emailId_field;

    @FindBy(xpath = "//input[@id='usr']")
    WebElement userName_field;

    @FindBy(xpath = "//input[@id='pwd']")
    WebElement password_field;

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//h1[normalize-space()='User Registered Successfully !!!']")
    WebElement successfulMessage_registration;



    public RegistrationPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String visibilityRegistrationPage() {
        return registration_heading_xpath.getText();
    }

    public void selectSalutationDropdown(String value) {

        Select select = new Select(salutationDropdown_xpath);
        select.selectByVisibleText(value);
    }

  public void sendKeysFirstName(String Firstname) {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(firstName_field)).sendKeys(Firstname);
  }

    public void sendKeysLastName(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lastName_field)).sendKeys(lastName);
    }

    public void sendKeysEmailId(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(emailId_field)).sendKeys(email);
    }

    public void sendKeysContactNumber(String contactNumberT) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(contactNumber)).sendKeys(contactNumberT);
    }

    public void sendKeysUserName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(userName_field)).sendKeys(username);
    }

    public void sendKeysPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(password_field)).sendKeys(password);
    }

    public void submitButtonRegistration() {
        submitButton.click();
    }

    public String visibilitySuccessfulMessageRegistration() {
       return successfulMessage_registration.getText();
    }

}
