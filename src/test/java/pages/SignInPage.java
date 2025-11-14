package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.BrowserDriver.driver;

public class SignInPage {

    private final WebDriver driver;

    public  SignInPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id="//input[@id='usr']")
    WebElement username_text;
    @FindBy(id="//input[@id='pwd']")
    WebElement password_text;
    @FindBy(id="//input[@value='Login']")
    WebElement login_btn ;
    @FindBy(xpath="//button[@id='NewRegistration']")
    WebElement registration_btn ;


    public void sendKeys_username() {

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(username_text)).sendKeys("sam");

//       username_text.sendKeys("sam");
   }

    public void sendKeys_password() {
        password_text.sendKeys("alex");
    }

    public void click_loginBtn() {
       login_btn.click();
    }

    public void click_registrationBtn() {
       registration_btn.click();
    }





//    public static String username_text="//input[@id='usr']";
//    public static String password_text="//input[@id='pwd']";
//    public static String login_btn="//input[@value='Login']";
//    public static String registration_btn="//button[@id='NewRegistration']";


//    public static void sendKeys_username() {
//        driver.findElement(By.xpath(username_text)).sendKeys("sam");
//
//    }

//
//    public static void sendKeys_password() {
//    driver.findElement(By.xpath(password_text)).sendKeys("alex");
//
//    }

//    public static void click_loginBtn() {
//        driver.findElement(By.xpath(login_btn)).click();
//
//    }
//
//    public static void click_registrationBtn() {
//        driver.findElement(By.xpath(registration_btn)).click();
//
//    }


}




