package stepDefiniation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart_Login {
	public static WebDriver driver;
	@Given("user is on browser of flipkart")
	public void user_is_on_browser_of_flipkart() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}

	@When("user enters url of flipkart")
	public void user_enters_url_of_flipkart() throws InterruptedException {
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	@Then("user should see email or mobilenum and enter password textboxes")
	public void user_should_see_email_or_mobilenum_and_enter_password_textboxes() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).isDisplayed();
		Thread.sleep(2000);
	}

	@When("user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password_of_flipkart(String username,String password) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		Thread.sleep(2000);
	}
	@When("cliks  on login button of flipkart")
	public void cliks_on_login_button_of_flipkart() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Thread.sleep(3000);   
	}

	@Then("user should see the homepage of flipkart application")
	public void user_should_see_the_homepage_of_flipkart_application() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='naveen']")).isDisplayed();
		Thread.sleep(5000);
	}
	@When("user mouseover on fashion")
	public void user_mouseover_on_fashion() throws InterruptedException {
		WebElement fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();
		Thread.sleep(4000);
	}

	@When("clicks on mens foot wear")
	public void clicks_on_mens_foot_wear() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]")).click();    
		Thread.sleep(4000);
	}

	@Then("user should see the foot wear products")
	public void user_should_see_the_foot_wear_products() throws InterruptedException {
		System.out.println("user should see the foot wear products"); 
		Thread.sleep(4000);
	}

	@When("user clicks on liked product")
	public void user_clicks_on_liked_product() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div[4]/div/div/a[1]")).click();
		Thread.sleep(5000);

		Set<String> windows=driver.getWindowHandles();
		int count = windows.size();
		System.out.println(count);
		//System.out.println("------------Available Windows : - " + windows.size());

		Iterator<String> window=windows.iterator();
		Thread.sleep(2000);
		String window1=window.next();
		Thread.sleep(2000);
		String window2=window.next();
		Thread.sleep(2000);
		//		for(String w:windows)
		//		{
		//			System.out.println("------------Window Alfa Numeric ID : -" + w);
		//		}

		driver.switchTo().window(window2);

	}

	@Then("click on size of the shoes")
	public void click_on_size_of_the_shoes() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='9']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class='col col-6-12']//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(4000);
	}

	@Then("user should see the place order button")
	public void user_should_see_the_place_order_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Place Order']/..")).isDisplayed();
		Thread.sleep(3000);
	}

	@When("user clicks on place order")
	public void user_clicks_on_place_order() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Place Order']/..")).click();   
		Thread.sleep(3000);
	}
	@When("clicks on delivery here")
	public void clicks_on_delivery_here() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
		Thread.sleep(3000);
		//driver.close();
	}
	@Then("click on continue button")
	public void click_on_continue_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']")).click();    
		Thread.sleep(1000);
	}
	@Then("click on cash on delivery here option")
	public void click_on_cash_on_delivery_here_option() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[7]")).click();
		Thread.sleep(3000);
	}
	@Then("click on confirm order")
	public void click_on_confirm_order() {
    driver.findElement(By.xpath("//span[text()='Confirm Order']")).click();
	}
}

	
	
	
	
	
	
//	@Then("click on Netbanking option")
//	public void click_on_netbanking_option() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[1]/div/label[4]/div[1]")));
//		
//	}
//
//	@Then("click on select bank dropdown")
//	public void click_on_select_bank_dropdown() throws InterruptedException {
//		WebElement select_Bank = driver.findElement(By.xpath("//select[@class='_1kwp-i']"));
//		Thread.sleep(2000);
//		Select s = new Select(select_Bank);
//		Thread.sleep(2000);
//		s.selectByVisibleText("Bank of India");
//	}
	//
	//	@Then("click on Indian Bank")
	//	public void click_on_indian_bank() {
	//	    // Write code here that turns the phrase above into concrete actions
	//	    throw new io.cucumber.java.PendingException();
	//	}

//	@Then("click on Pay")
//	public void click_on_pay() {
//		driver.findElement(By.xpath("//button[text()='PAY ₹1,187']")).click();
//	}
//
//}

//driver.findElement(By.xpath("//button[starts-with(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
//driver.findElement(By.linkText("ADD TO CART")).click();
//driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
