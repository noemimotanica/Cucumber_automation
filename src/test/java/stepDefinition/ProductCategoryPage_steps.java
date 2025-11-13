package stepDefinition;

import io.cucumber.java.en.Then;
import pages.ProductCategoryPage;

import static org.junit.Assert.assertEquals;
import static utility.BrowserDriver.driver;


public class ProductCategoryPage_steps {

//   ProductCategoryPage productCategoryPage;//fiecare pagina e o clasa si aici declaram obiectul clasei si prin obiect putem folosi metodele clasei
    ProductCategoryPage productCategoryPage=new ProductCategoryPage(driver);
    @Then("he should be able to view the product category page")
    public void he_should_be_able_to_view_the_product_category_page() {
//        productCategoryPage.visibility_categoryPage();

        String actualProductCategory = productCategoryPage.visibility_categoryPage();
        assertEquals("Formal Shoes", actualProductCategory);
    }

    //constructorul are rolul de a initia obiectul; o metoda speciala care se executa automat cand creez un obiect



//      String actualProductCategory= visibility_categoryPage();
//      assertEquals(actualProductCategory,"Formal Shoes");

    }


