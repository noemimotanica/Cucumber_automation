package StepDefinition;

import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.ProductCategoryPage.*;
public class ProductCategoryPage {

    @Then("he should be able to view the product category page")
    public void he_should_be_able_to_view_the_product_category_page() {
      String actualProductCategory= visibility_categoryPage();
      assertEquals(actualProductCategory,"Formal Shoes");

    }

}
