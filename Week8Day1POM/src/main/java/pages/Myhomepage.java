package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class Myhomepage extends ProjectSpecificMethods {
	@And("click on leads link")
	public MyLeadpage clickLeadslink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadpage();
	}

	
	}


