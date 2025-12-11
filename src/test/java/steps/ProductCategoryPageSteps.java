package steps;

import io.cucumber.java.en.Then;
import pages.ProductCategoryPage;

import java.io.IOException;
import static org.junit.Assert.assertEquals;



public class ProductCategoryPageSteps {

//   ProductCategoryPage productCategoryPage;//fiecare pagina e o clasa si aici declaram obiectul clasei si prin obiect putem folosi metodele clasei
    ProductCategoryPage productCategoryPage=new ProductCategoryPage(driver);

    public ProductCategoryPageSteps() throws IOException {
    }

    @Then("he should be able to view the product category page")
    public void viewTheProductCategoryPage() {
        String actualProductCategory = productCategoryPage.visibilityCategoryPage();
        assertEquals("Formal Shoes", actualProductCategory);
    }
    //constructorul are rolul de a initia obiectul; o metoda speciala care se executa automat cand creez un obiect
    }


