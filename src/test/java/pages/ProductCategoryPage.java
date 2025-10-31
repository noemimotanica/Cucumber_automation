package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage {

    private final WebDriver driver;

    @FindBy(xpath = "//div[@id='SmokeTests']//h3[@id='ShoeType']")
    WebElement product_category_xpath;

    public ProductCategoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String visibility_categoryPage() {
        return product_category_xpath.getText();

    }

}



//    public static String product_category_xpath="//div[@id='SmokeTests']//h3[@id='ShoeType']";

//    public static String visibility_categoryPage() {
//       String actualProductCategory= driver.findElement(By.xpath(product_category_xpath)).getText();
//       return actualProductCategory;
//
//    }

