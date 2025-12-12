package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement hamburger_menu;
    @FindBy(xpath = "//li[normalize-space()='Contact']")
    WebElement contactPage;
    @FindBy(xpath = "//a[normalize-space()='Read the full documentation']")
    WebElement linkDocumentation;
    @FindBy(xpath = "//h2[normalize-space()='Start here']")
    WebElement headingPage;


    public ContactPage (){
        super();
    }

    public void clickContactPage() {
        waitForElementToBeClickable(contactPage);
        click(contactPage);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(contactPage)).click();
    }

    public void clickLinkDocumentation() {
        waitForElementToBeClickable(linkDocumentation);
        click(linkDocumentation);
//        linkDocumentation.click();
    }

    public String visibilityHeadingPage() {
       return grabTextFromElement(headingPage);
//        waitForElementVisibility(headingPage);
//        return headingPage.getText();
    }


}
