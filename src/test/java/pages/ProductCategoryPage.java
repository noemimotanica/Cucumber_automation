package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductCategoryPage extends BasePage {


    @FindBy(xpath = "//div[@id='SmokeTests']//h3[@id='ShoeType']")
    WebElement product_category_xpath;

    public ProductCategoryPage {
        super();
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }

    public String visibilityCategoryPage() {
       return grabTextFromElement(product_category_xpath);
//        return product_category_xpath.getText();
    }
}


