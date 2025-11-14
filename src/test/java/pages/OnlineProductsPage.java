package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utility.Hooks;

import java.time.Duration;

public class OnlineProductsPage extends Hooks {

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


    public void click_onlineProducts_menu(){
        onlineProducts_menu.click();
    }

    public void click_formal_shoes_dropdown(){
        formal_shoes_dropdown.click();
    }

    public String visibility_shoesType(){
        return shoes_type.getText();

    }

    public void select_shoeColor(){
        Select select=new Select(colour_available);
        select.selectByVisibleText("Brown");
    }

    public void select_sizeAvailable(){
        Select select=new Select(size_available);
        select.selectByVisibleText("8");
    }

}
