package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactPage {

    private final WebDriver driver;

    @FindBy(xpath="//input[@type='checkbox']")
    WebElement hamburger_menu;
    @FindBy(xpath="//li[normalize-space()='Contact']")
    WebElement  contactPage ;
    @FindBy(xpath="//a[normalize-space()='Read the full documentation']")
    WebElement  linkDocumentation ;
    @FindBy(id="#title-h1")
    WebElement  headingPage ;


    public ContactPage (WebDriver driver) {
        this.driver=driver;
//        super()
        PageFactory.initElements(driver,this);
    }




    public void clickContactPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(contactPage)).click();
    }

    public void clickLinkDocumentation() {
      linkDocumentation.click();
    }

    public String visibilityHeadingPage() {
        return headingPage.getText();
    }

}
