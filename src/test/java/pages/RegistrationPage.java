package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class RegistrationPage extends BasePage {


     WebDriver driver;

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

    public RegistrationPage (WebDriver driver) throws IOException {
        super();
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
    }

    public String visibilityRegistrationPage() {
       return grabTextFromElement(registration_heading_xpath);

//        return registration_heading_xpath.getText();
    }

    public void selectSalutationDropdown(String value) {
          selectByVisibleText(salutationDropdown_xpath, value);
//        Select select = new Select(salutationDropdown_xpath);
//        select.selectByVisibleText(value);
    }

  public void sendKeysFirstName(String Firstname) {
        clearAndSendKeys(firstName_field, Firstname);
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//      wait.until(ExpectedConditions.elementToBeClickable(firstName_field)).sendKeys(Firstname);
  }

    public void sendKeysLastName(String lastName) {
        clearAndSendKeys(lastName_field, lastName);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(lastName_field)).sendKeys(lastName);
    }

    public void sendKeysEmailId(String email) {
        clearAndSendKeys(emailId_field, email);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(emailId_field)).sendKeys(email);
    }

    public void sendKeysContactNumber(String contactNumberT) {
        clearAndSendKeys(contactNumber, contactNumberT);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(contactNumber)).sendKeys(contactNumberT);
    }

    public void sendKeysUserName(String username) {
        clearAndSendKeys(userName_field,username);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(userName_field)).sendKeys(username);
    }

    public void sendKeysPassword(String password) {
        clearAndSendKeys(password_field, password);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(password_field)).sendKeys(password);
    }

    public void submitButtonRegistration() {
        waitForElementToBeClickable(submitButton);
//        submitButton.click();
    }

    public String visibilitySuccessfulMessageRegistration() {
       return grabTextFromElement(successfulMessage_registration);

//        return successfulMessage_registration.getText();
    }

}
