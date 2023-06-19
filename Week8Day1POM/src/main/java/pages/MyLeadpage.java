package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class MyLeadpage extends ProjectSpecificMethods{
	/*
		public MyLeadsPage(ChromeDriver driver) {
			this.driver=driver;
		}
	 */
	@And("click on create lead link")
	public CreateLeadpage clickCreateLeadButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadpage();

	}

}
