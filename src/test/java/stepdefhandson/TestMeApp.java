package stepdefhandson;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class TestMeApp {

	WebDriver d;
	@Given("Navigate to home page")
	public void navigate_to_home_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		//d.get("http://github.com/");
		d.get("http://demowebshop.tricentis.com/");
		d.manage().window().maximize();
		
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String username,String password)
	{
	    d.findElement(By.linkText("Log in")).click();
		d.findElement(By.xpath("//input[@name='Email']")).sendKeys(username);
		d.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		d.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Then("Message Login successfully")
	public void message_Login_successfully() {
		String act=d.getTitle();
		String exp="Demo Web Shop";
		if(act.equals(exp))
		{
			System.out.println("login succesfull");
		}
		Assert.assertEquals(exp, act);
		System.out.println("login is succesfull");
		d.close();
		
		
		
		
		
	}

}
