package stepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class products_Login {
	public static WebDriver driver;
	@Given("user is on chrome browser")
	public void user_is_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}

	@When("user enters url of application")
	public void user_enters_url_of_application() {
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication");
		driver.manage().window().maximize();

	}

	@When("hits enters on  products page")
	public void hits_enters_on_products_page() {
		System.out.println("user enters hit button");
	}

	@Then("user should see the username and password of products page")
	public void user_should_see_the_username_and_password_of_products_page() {
		System.out.println("user should see the username and password of products page");
	}

	@When("user enters username and password of products page")
	public void user_enters_username_and_password_of_products_page() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("surenderreddy71@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("passwd")).sendKeys("Surender5850@");
		Thread.sleep(3000);
	}

	@When("clicks on sign of products")
	public void clicks_on_sign_of_products() {
		driver.findElement(By.xpath("//i[@class='icon-lock left']/..")).click();
	}

	@Then("user should see the home page of products")
	public void user_should_see_the_home_page_of_products() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).isDisplayed();
		Thread.sleep(3000);
	}
	@Then("move curser on dresses")
	public void move_curser_on_dresses() throws InterruptedException {
		WebElement dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(dresses).perform(); 
		Thread.sleep(4000);
	}

	@Then("click on casual dresses")
	public void click_on_casual_dresses() throws InterruptedException {
		driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[2]")).click();
		Thread.sleep(4000);
	}
	@Then("move user curser on printed dress")
	public void move_user_curser_on_printed_dress() throws InterruptedException {
		WebElement PrintedDress = driver.findElement(By.xpath("//img[@title='Printed Dress']"));  
		Actions action=new Actions(driver);
		action.moveToElement(PrintedDress).perform();
		Thread.sleep(4000);
	}

	@Then("click on add cart")
	public void click_on_add_cart() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();  
		Thread.sleep(4000);
	}

	@And("click on proceed to checkout")
	public void click_on_proceed_to_checkout() throws InterruptedException {
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']")); 
		Thread.sleep(4000);
		proceed.click();
		WebDriverWait wait = new WebDriverWait(driver, 40); 
		wait.until(ExpectedConditions.visibilityOf(proceed));
		wait.until(ExpectedConditions.elementToBeClickable(proceed));

		
	}
	@Then("click on continue shopping")
	public void click_on_continue_shopping() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Continue shopping']")).click();
		Thread.sleep(4000);
	} 
	@Then("move curser on women dresses")
	public void move_curser_on_women_dresses() throws InterruptedException {
		WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Actions action = new Actions(driver); 
		action.moveToElement(women).perform();	
		Thread.sleep(4000);
	}

	@Then("click on evening dresses")
	public void click_on_evening_dresses() throws InterruptedException {
		driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[1]")).click(); 
		Thread.sleep(4000);

	}
	@And("mouseover on printed dress")
	public void mouseover_on_printed_dress() throws InterruptedException {
		WebElement PrintedDress = driver.findElement(By.xpath("//img[@title='Printed Dress']")); 
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(PrintedDress).perform();
		Thread.sleep(4000);

	}

	@Then("click on add to cart")
	public void click_on_add_to_cart() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click(); 
		Thread.sleep(4000);
	}
	@Then("click on signout")
	public void click_on_signout() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
