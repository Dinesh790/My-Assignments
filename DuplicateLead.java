package Week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  1. Launch URL  http://leaftaps.co/opentaps/control/login
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Select State/Province as NewYork Using Visible Text
		  15. Click on Create Button
                  16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
                  17. Click on Duplicate button
                  18. Clear the CompanyName Field using .clear() And Enter new CompanyName
                  19.Clear the FirstName Field using .clear() And Enter new FirstName
                  20.Click on Create Lead Button
                  21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		 */
		//Launch URL "http://leaftaps.com/opentaps/control/login"
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");

				//Window maximize
				driver.manage().window().maximize();
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Enter UserName and Password Using Id Locator
				driver.findElement(By.id("username")).sendKeys("demoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click on Login Button using Class Locator
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click on CRM/SFA Link
				driver.findElement(By.partialLinkText("CRM/SFA")).click();
				//Click on Leads Button
				driver.findElement(By.linkText("Leads")).click();
				//Click on Create Lead 
				driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				//Enter CompanyName Field Using id Locator
		        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		        //Enter FirstName Field Using id Locator
		        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dinesh");
		        //Enter LastName Field Using id Locator
		        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		        //Enter FirstName(Local) Field Using id Locator
		        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anbu");
		        //Enter Department Field Using any Locator of Your Choice
		        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
		        //Enter Description Field Using any Locator of your choice 
		        driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation tester");
		        //Enter your email in the E-mail address Field using the locator of your choice
		        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dineshmani@gmail.com");
		        //Select State/Province as NewYork Using Visible Text
		        WebElement Element=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		        Select sec=new Select(Element);
		        sec.selectByVisibleText("New York");
		        //Click on Createlead Button
		        driver.findElement(By.className("smallSubmit")).click();
		        System.out.println(driver.getTitle());
		        //Click on Duplicate button
		        driver.findElement(By.linkText("Duplicate Lead")).click();
		        //Clear the CompanyName Field using .clear() And Enter new CompanyName
		        driver.findElement(By.id("createLeadForm_companyName")).clear();
		        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ilink");
		        //Clear the FirstName Field using .clear() And Enter new FirstName
		        driver.findElement(By.id("createLeadForm_firstName")).clear();
		        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anbu");
		        //Click on Create Lead Button
		        driver.findElement(By.className("smallSubmit")).click();
				System.out.println(driver.getTitle());

	}

}
