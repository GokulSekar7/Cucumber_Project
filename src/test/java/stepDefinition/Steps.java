package stepDefinition;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public ChromeDriver driver;
	
	@Given ("Launch the browser")
	public void launchTheBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given ("Load the url")
	public void loadTheUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@Given ("Enter the username")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	
	@Given ("Enter the password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	
	@When ("Click on the login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then ("Verify the login is successful")
	public void verifyLogin() {
		System.out.println(driver.getTitle());
	}
	
}
