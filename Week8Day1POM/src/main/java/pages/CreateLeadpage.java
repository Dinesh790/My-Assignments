package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadpage extends ProjectSpecificMethods{
	
 @Given("Enter the company name as(.*)$")
	public CreateLeadpage enterCompanyName(String Companyname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Companyname);
		return this;

	}
 
 @And("Enter the firstname as(.*)$")
	public CreateLeadpage enterFirstName(String firstname) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
		
	}

 
 @And("Enter the lastname as(.*)$")
	public CreateLeadpage enterLastName(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;

	}
 @And("click on submit button")
	public  Viewleadpage clicksubmit() {

		driver.findElement(By.name("submitButton")).click();
		return new Viewleadpage();
	}
}
