package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCategoryPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@id='SmokeTests']//h3[@id='ShoeType']")
    WebElement product_category_xpath;

    public ProductCategoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String visibilityCategoryPage() {
        return product_category_xpath.getText();
    }
}


