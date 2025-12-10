package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage  {
    WebDriver driver;
    protected String baseUrl;
    protected WebDriverWait wait;

    //private final  WebDriver driver;
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement hamburger_menu;
    @FindBy(xpath="//li[normalize-space()='Sign In Portal']")
    WebElement signIn_portal;

    public HomePage (WebDriver driver) {
        //without return type, same name as class
        //Webdriver instance

//        this.baseUrl = "http://localhost:8000/index.php";
//        this.driver = WebDriverManager.getDriver();
//        wait        = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
//        this.driver = driver;

        PageFactory.initElements(driver, this); //for initializing the elements
        //contructor is called whenever the object of the class is being created


    }
//
//    public String getBaseUrl() {
//
//        return baseUrl;
//
//    }


    public  void  clickHamburgerMenu(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.elementToBeClickable(hamburger_menu)).click();
          hamburger_menu.click();
        }


       public void  clickSignInPortal(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signIn_portal)).click();
      }

    }

