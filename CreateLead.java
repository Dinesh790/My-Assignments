package Week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		//to maximize
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Enter Username
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("demoSalesManager");

		//Enter Password
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");

		//Login button

		WebElement Login=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		Login.click();

		//Click on CRM/SFA
		WebElement CRMClick=driver.findElement(By.partialLinkText("CRM/SFA"));
		CRMClick.click();

		//Click on Create Lead

		WebElement CreateLead=driver.findElement(By.xpath("//a[text()='Create Lead']"));
		CreateLead.click();

		//Enter CompanyName Field
		WebElement Companyname=driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		Companyname.sendKeys("Testleaf");

		//Enter FirstName Field
		WebElement FirstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		FirstName.sendKeys("Dinesh");

		// Enter LastName Field
		WebElement LastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		LastName.sendKeys("M");
		//Enter Firstname local

		WebElement Fnlocal=driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
		Fnlocal.sendKeys("Priya");

		//Enter Department Field

		WebElement DepartmentField=driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']"));
		DepartmentField.sendKeys("Developer");

		//Enter Description Field

		WebElement DescriptionField=driver.findElement(By.xpath("Description Field"));
		DescriptionField.sendKeys("Angular developer");

		//E-mail address Field

		WebElement addressField=driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		addressField.sendKeys("dineshanbarasu3@gmail.com");
		//Select State/Province

		WebElement element1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec=new Select(element1);
		sec.selectByVisibleText("New York");
		
		//Click create Lead button
		WebElement Submit=driver.findElement(By.className("//input[@class='smallSubmit']"));
		Submit.click();
		System.out.println(driver.getTitle());




	}

}
