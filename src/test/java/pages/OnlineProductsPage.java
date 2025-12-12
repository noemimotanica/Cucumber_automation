package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineProductsPage extends BasePage {


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


   public OnlineProductsPage {
       super();
//       this.driver=driver;
//       PageFactory.initElements(driver,this);
   }

    public void clickOnlineProductsMenu(){

        waitForElementToBeClickable(onlineProducts_menu);
        click(onlineProducts_menu);

//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(onlineProducts_menu)).click();
    }

    public void clickFormalShoesDropdown(){
        click(formal_shoes_dropdown);
//       formal_shoes_dropdown.click();
    }

    public String visibilityShoesType(){
     return grabTextFromElement(shoes_type);
//       return shoes_type.getText();
    }

    public void selectShoeColor(){
    selectByVisibleText(colour_available, "Brown");
//        Select select=new Select(colour_available);
//        select.selectByVisibleText("Brown");
    }

    public void selectSizeAvailable(){
       selectByVisibleText(size_available,"8");
//        Select select=new Select(size_available);
//        select.selectByVisibleText("8");
    }

}
