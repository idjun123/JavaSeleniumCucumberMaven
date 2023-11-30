package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static pages.CollectionPage.*;

public class CollectionPage {

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws Throwable {
        formalShoesValidation();
    }


}
