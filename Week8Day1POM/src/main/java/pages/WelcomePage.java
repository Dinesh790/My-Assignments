package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethods{

	@Then ("Homepage should displayed")
	public WelcomePage verifyHomepage() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Login success full");
		}
		else {
			System.out.println("Login not successfull");
		}
		return this;
	}
	@When("click on crmsfa link")
	public Myhomepage clickCRMSFAlink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new Myhomepage();
	}


}
