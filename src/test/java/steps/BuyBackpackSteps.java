package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ShoppingPage;

public class BuyBackpackSteps {

	ShoppingPage shoppingPage = new ShoppingPage();

	@Given("^I open the app$")
	public void i_open_the_app() {
		shoppingPage.launchApp();
	}

	@When("^I am in the shopping page$")
	public void i_am_in_the_shopping_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^I select the backpack$")
	public void i_select_the_backpack() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I pick the color blue$")
	public void i_pick_the_color_blue() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I add the quantity to two$")
	public void i_add_the_quantity_to_two() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I select add to cart button$")
	public void i_select_add_to_cart_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I select proceed checkout$")
	public void i_select_proceed_checkout() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I complete the login form$")
	public void i_complete_the_login_form() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I select login$")
	public void i_select_login() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I complete the shipping form$")
	public void i_complete_the_shipping_form() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I select to payment button$")
	public void i_select_to_payment_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I complete the payment form$")
	public void i_complete_the_payment_form() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I select review order button$")
	public void i_select_review_order_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I select place order button$")
	public void i_select_place_order_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I select go back shopping button$")
	public void i_select_go_back_shopping_button() {
		// Write code here that turns the phrase above into concrete actions
	}
}
