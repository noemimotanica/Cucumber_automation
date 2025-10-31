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

public class HomePage {

private final  WebDriver driver;
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement hamburger_menu;
    @FindBy(xpath="//li[normalize-space()='Sign In Portal']")
    WebElement signIn_portal;

    public HomePage (WebDriver driver) {
        //without return type, same name as class
        //Webdriver instance
        this.driver = driver;
        PageFactory.initElements(driver, this); //for initializing the elements
        //contructor is called whenever the object of the class is being created


    }
        public  void  click_hamburger_menu(){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(hamburger_menu)).click();
//           hamburger_menu.click();
        }


       public void  click_signIn_portal(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signIn_portal)).click();
//        signIn_portal.click();
      }






//    public static String hamburger_menu="//input[@type='checkbox']";
//    public static String signIn_portal="//li[normalize-space()='Sign In Portal']";

//        public static void click_hamburger_menu () throws InterruptedException {
////        Thread.sleep(2000);
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(hamburger_menu))).click();
//
////        driver.findElement(By.xpath(hamburger_menu)).click();
//
//        }
//
//        public static void click_signIn_portal () throws InterruptedException {
////        Thread.sleep(2000);
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(signIn_portal))).click();
////        driver.findElement(By.xpath(signIn_portal)).click();
//        }

    }

