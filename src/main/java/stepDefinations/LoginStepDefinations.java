//package stepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinations {
//	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","D:\\Software\\Testing Software\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.get("https://www.freecrm.com/index.html");
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() throws Throwable {
//		String title= driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
//	   
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String username, String password) throws Throwable {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	   
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//		Thread.sleep(2500);
//	   driver.findElement(By.xpath("//input[@value='Login']")).click();
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//	   String title=driver.getTitle();
//	   System.out.println("Home page title is " + title);
//	   Assert.assertEquals("CRMPRO", title);
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		Thread.sleep(3000);
//		
//	}
//
//	
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and_and(String ftname, String ltname, String posn) throws Throwable {
//	  
//		 driver.findElement(By.id("first_name")).sendKeys(ftname);
//		 driver.findElement(By.id("surname")).sendKeys(ltname);
//		 driver.findElement(By.id("company_position")).sendKeys(posn);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	}
//
//	
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	   driver.quit();
//	}
//
//
//
//
//}
