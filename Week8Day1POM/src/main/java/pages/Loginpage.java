package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Loginpage extends ProjectSpecificMethods{
//if we not used static keyword then we should use constructor this keyword
	//public Loginpage(ChromeDriver driver) {
		//this.driver=driver;

@Given("Enter the Username as {string}")
public Loginpage enter_the_username_as_demosalesmanager(String uName) {
	System.out.println(driver);
	driver.findElement(By.id("username")).sendKeys(uName);
	return this; 
}
@And("Enter the password as {string}")
public Loginpage enter_the_password_as_crmsfa(String pWord) {
	driver.findElement(By.id("password")).sendKeys(pWord);
	return this;
}
@When("Click on Login button")
public WelcomePage click_on_login_button() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage();
}

	
	
	
	/*
	@Given ("Enter the Username as {string}")
	public Loginpage enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	@And("Enter the password as{string}")
	public Loginpage enterpassWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	@When("Click on Login button")
	public WelcomePage clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
	*/
}
