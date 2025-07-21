package stepdefinitions;

import cucumber.practices.cucu.Search;
import cucumber.practices.cucu.product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

	product prod;
	Search search;
	String actualResult;
	
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Search field available");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Searching for: " + productName + ", Price: " + price);
		prod = new product(productName, price);
		search = new Search();
		actualResult = search.displayProduct(prod);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String expectedName) {
		System.out.println("Expected: " + expectedName);
		System.out.println("Actual: " + actualResult);
		Assert.assertEquals("Product name does not match", expectedName, actualResult);
	}
}
