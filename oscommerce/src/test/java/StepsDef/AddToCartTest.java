package StepsDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddToCartTest {
	private WebDriver driver;
	
	@Given("I open the browser")
	public void i_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Then("I navigate to Product Page")
	public void i_navigate_to_Product_Page() {
	    System.out.println("Page is opened");
    	driver.get("http://demoshop.pagamastarde.com/oscommerce-2.3.4/");
    	driver.get("http://demoshop.pagamastarde.com/oscommerce-2.3.4/product_info.php?products_id=17");
	}
	
	@Then("I click on add to cart and proceeding checkout")
	public void i_click_on_add_to_cart_and_proceeding_checkout() {
	    driver.findElement(By.id("tdb4")).click();
	    driver.findElement(By.id("tdb5")).click();
	}
	
	@Then("I enter credentials into input fields and loging in")
	public void i_enter_credentials_into_input_fields_and_loging_in() {
		driver.findElement(By.name("email_address")).sendKeys("test@test.com");  
		driver.findElement(By.name("password")).sendKeys("test12345");
	    driver.findElement(By.id("tdb1")).click();
	}
	@Then("I navigate forward to confirmation page")
	public void i_navigate_forward() {
	    driver.findElement(By.id("tdb6")).click();
	    driver.findElement(By.xpath("//input[@name='payment' and @value='cod']")).click();
	    driver.findElement(By.id("tdb6")).click();
	}
}