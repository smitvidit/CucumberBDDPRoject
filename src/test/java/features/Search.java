package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("^I visited the website as Guest User$")
	public void i_visited_the_website_as_guest_user() {
		
		System.out.println("hello 1");
		
	}

	@When("^I select the Books from the Search Dropdown$")
	public void i_select_the_books_from_the_search_dropdown() {
		System.out.println("2");
	}

	@When("^I click on search icon option$")
	public void i_click_on_search_icon_option() {
		System.out.println("3");
	}

	@Then("^I should see the page having heading as Amazon best reads is displayed$")
	public void i_should_see_the_page_having_heading_as_amazon_best_reads_is_displayed() {
		System.out.println("4");
	}

	@Then("^I should not see the other category product$")
	public void i_should_not_see_the_other_category_product() {

		System.out.println("5");
	}

}
