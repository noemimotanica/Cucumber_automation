package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class SignInPage {

    private final WebDriver driver;

    public  SignInPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOf(username_text)).sendKeys("sam");
   }

    public void sendKeysPassword(String password) {
        password_text.sendKeys("alex");
    }

    public void clickLoginBtn() {
       login_btn.click();
    }

    public void clickRegistrationBtn() {
       registration_btn.click();
    }
}




