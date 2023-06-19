package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;

public class Viewleadpage extends ProjectSpecificMethods{
	
		
		@Then("viewleadpage should be displayed as <companyname>")
		public Viewleadpage verifyCreateLead() {
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains("TestLeaf")) {
				System.out.println("Lead created successfully");
			}
			else {
				System.out.println("Lead is not created");
			}
			return this;

		}
}
