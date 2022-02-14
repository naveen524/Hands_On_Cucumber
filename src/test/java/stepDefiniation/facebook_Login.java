package stepDefiniation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_Login {
	public static WebDriver driver;
	@Given("user is on chrome bowser of facebook")
	public void user_is_on_chrome_bowser_of_facebook() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);  
		
	}

	@When("user enters the url of facebook")
	public void user_enters_the_url_of_facebook() throws InterruptedException {
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Then("user should see the username and password textboxes of facebook")
	public void user_should_see_the_username_and_password_textboxes_of_facebook() throws InterruptedException {
		driver.findElement(By.name("login")).isDisplayed();
		Thread.sleep(3000);
		
		
	}

	@When("user enters the \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_and(String username, String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(3000);	
	}

	@When("clicks on login button of facebook")
	public void clicks_on_login_button_of_facebook() throws InterruptedException {
		driver.findElement(By.name("login")).click();  
		Thread.sleep(3000);
		
		
	}

	@Then("user should see the homepage of facebook")
	public void user_should_see_the_homepage_of_facebook() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Naveen Manneela']")).isDisplayed();
		Thread.sleep(3000);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	}

	@Then("user should see the search icon")
	public void user_should_see_the_search_icon() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).isDisplayed();
		Thread.sleep(3000);

	}

	@When("user enters the username in search icon")
	public void user_enters_the_username_in_search_icon() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("mahesh babu"); 
		Thread.sleep(3000);
		
		
	}

	@When("clicks on user liked autosuggession")
	public void clicks_on_user_liked_autosuggession() throws InterruptedException {
	    
		driver.findElement(By.xpath("//span[text()=' photo gallery']/..")).click(); 
		Thread.sleep(3000);
	}

	@Then("user should see search results")
	public void user_should_see_search_results() {
		System.out.println("user should see search results");
		
	}

	@When("user clicks on photos")
	public void user_clicks_on_photos() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Photos'])[1]")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='See all']")).click();
		Thread.sleep(3000);
	}

	@Then("user should see the photos")
	public void user_should_see_the_photos() throws InterruptedException {
		driver.findElement(By.xpath("(//img[@alt='No photo description available.,'])[4]")).click();
		Thread.sleep(3000);
		
		
	}

	@Then("click on back button")
	public void click_on_back_button() throws InterruptedException {	    
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().back();
	}

	@Then("user clicks on homepage of facebook")
	public void user_clicks_on_homepage_of_facebook() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='pmk7jnqg h5g66v2i nezaghv5'])[1]/..")).click(); 
		Thread.sleep(3000);

		
	}

	@Then("clicks on photo/video")
	public void clicks_on_photo_video() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//span[text()='Photo/Video']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv bp9cbjyn rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv pq6dq46d taijpn5t l9j0dhe7 tdjehn4e qypqp5cg q676j6op']")).click();
		Thread.sleep(3000);
		StringSelection selection = new  StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\Prince\\Prince_Img1.JPG");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

	}

	@Then("click on on post button")
	public void click_on_on_post_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Post']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
