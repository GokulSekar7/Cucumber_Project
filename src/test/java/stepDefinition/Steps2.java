package stepDefinition;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps2  extends ProjectSpecificMethod{
	/*
	 * @Given ("Launch the browser") public void launch() { driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); }
	 */	
	@When ("Click on the crmsfa link")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@When ("Click on the leads tab")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When ("Click on the create lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
}
