package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ProductCategoryPage extends BasePage {

    WebDriver driver;

    @FindBy(xpath = "//div[@id='SmokeTests']//h3[@id='ShoeType']")
    WebElement product_category_xpath;

    public ProductCategoryPage(WebDriver driver) throws IOException {
        super();
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }

    public String visibilityCategoryPage() {
       return grabTextFromElement(product_category_xpath);
//        return product_category_xpath.getText();
    }
}


