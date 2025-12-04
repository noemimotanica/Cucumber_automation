package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnlineProductsPage {

   WebDriver driver;

    @FindBy(xpath = "//li[normalize-space()='Online Products']")
    WebElement onlineProducts_menu;
    @FindBy(xpath = "//i[@class='fa fa-angle-double-down formalshoedropdown']")
    WebElement formal_shoes_dropdown;
    @FindBy(xpath = "//body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]")
    WebElement shoes_type;
    @FindBy(xpath = "//body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/select[1]")
    WebElement colour_available;
    @FindBy(xpath = "//body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[4]/select[1]")
    WebElement size_available;


   public OnlineProductsPage(WebDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }

    public void clickOnlineProductsMenu(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(onlineProducts_menu)).click();
    }

    public void clickFormalShoesDropdown(){
        formal_shoes_dropdown.click();
    }

    public String visibilityShoesType(){
        return shoes_type.getText();
    }

    public void selectShoeColor(){
        Select select=new Select(colour_available);
        select.selectByVisibleText("Brown");
    }

    public void selectSizeAvailable(){
        Select select=new Select(size_available);
        select.selectByVisibleText("8");
    }

}
