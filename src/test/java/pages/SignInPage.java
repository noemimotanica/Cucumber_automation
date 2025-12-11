package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;


public class SignInPage extends BasePage{

     WebDriver driver;

    public  SignInPage (WebDriver driver) throws IOException {
        super();
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='usr']")
    WebElement username_text;
    @FindBy(xpath="//input[@id='pwd']")
    WebElement password_text;
    @FindBy(xpath="//input[@value='Login']")
    WebElement login_btn ;
    @FindBy(xpath="//button[@id='NewRegistration']")
    WebElement registration_btn ;


    public void sendKeysUsername(String username) {
      clearAndSendKeys(username_text,username);
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//      wait.until(ExpectedConditions.visibilityOf(username_text)).sendKeys("sam");
   }

    public void sendKeysPassword(String password) {
        clearAndSendKeys(password_text,password);
//        password_text.sendKeys("alex");
    }

    public void clickLoginBtn() {
       waitForElementToBeClickable(login_btn);
//        login_btn.click();
    }

    public void clickRegistrationBtn() {
       waitForElementToBeClickable(registration_btn);
//        registration_btn.click();
    }
}




