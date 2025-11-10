package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.BrowserDriver.driver;



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

    public String visibility_RegistrationPage() {
        return registration_heading_xpath.getText();
    }

    public void selectSalutation_dropdown(String value) {

        Select select = new Select(salutationDropdown_xpath);
        select.selectByVisibleText(value);

    }


  public void sendKeys_firstname(String Firstname) {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(firstName_field)).sendKeys(Firstname);

  }

    public void sendKeys_lastname(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lastName_field)).sendKeys(lastName);
    }

    public void sendKeys_emailId(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(emailId_field)).sendKeys(email);
    }

    public void sendKeys_contactNumber(String contactNumberT) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(contactNumber)).sendKeys(contactNumberT);
    }

    public void sendKeys_userName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(userName_field)).sendKeys(username);
    }

    public void sendKeys_password(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(password_field)).sendKeys(password);
    }

    public void submitButton_registration() {
        submitButton.click();
    }

    public String visibility_successfulMessage_registration() {
       return successfulMessage_registration.getText();
    }








//    public static String registration_heading_xpath="//h1[normalize-space()='User Registration Page']";
//
//
//    public static String visibility_RegistrationPage() {
//
//
//        String actualRegistrationPageHeading= driver.findElement(By.xpath(registration_heading_xpath)).getText();
//        return actualRegistrationPageHeading;
//
//    }
}
