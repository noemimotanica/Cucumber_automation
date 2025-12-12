package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class HomePage extends BasePage  {


    //private final  WebDriver driver;
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement hamburger_menu;
    @FindBy(xpath="//li[normalize-space()='Sign In Portal']")
    WebElement signIn_portal;

    public HomePage {
        //without return type, same name as class
        //Webdriver instance
            super();
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public void clickHamburgerMenu() {

            waitForElementToBeClickable(hamburger_menu);
            hamburger_menu.click();
        }

        public void clickSignInPortal() {
        waitForElementVisibility(signIn_portal);
        click(signIn_portal);

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.elementToBeClickable(signIn_portal)).click();

        }

    }







