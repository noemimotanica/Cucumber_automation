package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage {

    public static String product_category_xpath="//div[@id='SmokeTests']//h3[@id='ShoeType']";


    public static String visibility_categoryPage() {
       String actualProductCategory= driver.findElement(By.xpath(product_category_xpath)).getText();
       return actualProductCategory;

    }
}
