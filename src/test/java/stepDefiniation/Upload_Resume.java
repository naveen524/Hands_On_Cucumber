package stepDefiniation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Resume {
	//https://app.pluralsight.com/library/history
	public static WebDriver driver;
	@Given("user is on chrome browser of naukri")
	public void user_is_on_chrome_browser_of_naukri() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

	}

	@When("user enters the url of naukri")
	public void user_enters_the_url_of_naukri() throws InterruptedException {
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(3000);    

	}

	@And("hits entter button on naukri")
	public void hits_entter_button_on_naukri() throws InterruptedException {
		System.out.println("inside step -hits entter button on naukri"); 
		Thread.sleep(3000);

	}
	@Then("user should see the login page of naukri")
	public void user_should_see_the_login_page_of_naukri() throws InterruptedException {

		driver.findElement(By.xpath("//div[text()='Login']")).isDisplayed();    
		Thread.sleep(3000);
	}

	@When("user clicks on login button of naukri")
	public void user_clicks_on_login_button_of_naukri() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);

	}

	@Then("user should see the username and password textboxes of the naukri")
	public void user_should_see_the_username_and_password_textboxes_of_the_naukri() throws InterruptedException {

		System.out.println("inside step- user should see the username and password textboxes of the naukri");
		Thread.sleep(3000);
	}
	
	@When("users enters the \"(.*)\" and \"(.*)\"$")
	public void users_enters_the_and(String Username, String Password) throws InterruptedException {
	    driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(Username);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys(Password);
	}

	@When("clicks on login button of naukri")
	public void clicks_on_login_button_of_naukri() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(9000); 
		driver.navigate().refresh();
		Thread.sleep(2000);

	}

	@Then("user should see the home page of naukri")
	public void user_should_see_the_home_page_of_naukri() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Automation Engineer']")).isDisplayed();


	}

	@When("user clicks on profile")
	public void user_clicks_on_profile() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Automation Engineer']")).click();
		Thread.sleep(6000);
	}

	@Then("user user should see update resume button")
	public void user_user_should_see_update_resume_button() throws InterruptedException {
		System.out.println("inside step- user user should see update resume button");
		Thread.sleep(3000);


	}

	@When("user clicks on update resume button")
	public void user_clicks_on_update_resume_button() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='uploadContainer'])[1]/../../..")).click();
		Thread.sleep(3000);


	}

	@When("user enters the path of files which he want to upload on naukri")
	public void user_enters_the_path_of_files_which_he_want_to_upload_on_naukri() throws InterruptedException, AWTException {
		System.out.println("inside step- user enters the path of files which he want to upload on naukri");   
		Thread.sleep(4000);
		StringSelection selection = new  StringSelection("C:\\Users\\Naresh Mannila\\Desktop\\Naveen Manneela 2.2 yrs Experince.docx");
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
		System.out.println("user should see resume updated successfully:");
		Thread.sleep(20000);
		driver.navigate().refresh();
		driver.quit();
	}
}

//	@Then("mouseover on companies")
//	public void mouseover_on_companies() throws InterruptedException {
//		WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
//		Actions a = new Actions(driver);
//		a.moveToElement(companies).perform();
//		Thread.sleep(3000);
//		
//	}
//
//	@Then("clicks on about companies link")
//	public void clicks_on_about_companies_link() throws InterruptedException {
//		driver.findElement(By.xpath("(//a[text()='About Companies'])[1]")).click();
//		Thread.sleep(3000);
//	}
//
//	@Then("user should see the search textbox")
//	public void user_should_see_the_search_textbox() throws InterruptedException {
//		System.out.println("inside step- user should see the search textbox");
//		Thread.sleep(6000);
//		driver.quit();
//	}
//
//	
//}
