package features;

import org.junit.After;

//import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Omayo {

	WebDriver driver;

	@Given("^I visited the omayo website$")
	public void i_visited_the_omayo_website() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

	}

	@When("^I enter username as (.+) and password as (.+)$")
	public void i_enter_username_and_password(String username, String password) {
		// Find and enter username
		WebElement usernameInput = driver.findElement(By.name("userid"));
		usernameInput.sendKeys(username);
		// Find and enter password
		WebElement passwordInput = driver.findElement(By.name("pswrd"));
		passwordInput.sendKeys(password);
	}

	@And("^I click on login button$")
	public void i_click_on_login_button() {
		// Find and click on the login button
		WebElement loginButton = driver.findElement(By.cssSelector("input[value='Login']"));
		loginButton.click();
	}

	@Then("^I should see be able to login to Omayo Portal with [^\"]* login status$")
	public void i_should_see_login_status(String loginStatus) {
		// Check if login status message is displayed
		WebElement statusMessage = driver.findElement(By.id("loginStatusMessage"));
		// assertEquals(loginStatus, statusMessage.getText());
	}

	@After
	public void closeBrowser() {
		// Close the browser
		driver.quit();
	}
}
