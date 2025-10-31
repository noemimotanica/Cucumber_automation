package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utility.BrowserDriver.driver;



public class RegistrationPage {


    private WebDriver driver;

    public RegistrationPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[normalize-space()='User Registration Page']")
    WebElement registration_heading_xpath;

    public String visibility_RegistrationPage() {
        return registration_heading_xpath.getText();
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
