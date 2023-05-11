package marathonTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws Throwable {
		/*
		 * 01) Launch the Url  https://www.pvrcinemas.com/
02) Click  on Movie Library
03) Select the City -->chennai
04) Select the Genre-->Animation
05) Select the Language-->english
06) Click on Apply
07) Click on first resulting animation movie
08) Click proceed to book
09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
10) Click on copy to self 
11) Click on  Send Request
12) Click cancel 
13) Close the OTP dialog
14) Verify the ttile of the page
		 */
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");

		//to maximize
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click  on Movie Library
		driver.findElement(By.xpath("//div[contains(@class,'header-extra-links-item fancy-dropdown')]/following-sibling::div[1]")).click();
		//Select the City -->chennai
		Thread.sleep(2000);
		Select select1=new Select(driver.findElement(By.xpath("//label[text()='City']/following-sibling::select")));
		select1.selectByVisibleText("Chennai");
		//Select the Genre-->Animation
		Select select2=new Select(driver.findElement(By.xpath("//label[text()='Genre']/following-sibling::select")));
		select2.selectByVisibleText("ANIMATION");
		Select select3=new Select(driver.findElement(By.xpath("(//div[@class='form-group ng-star-inserted']//select)[2]")));
		select3.selectByVisibleText("ENGLISH");
		// Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		//Click on first resulting animation movie
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();

		// Click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();

		//Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		Thread.sleep(2000);
		Select sel=new Select(driver.findElement(By.id("cinemaName")));
		sel.selectByIndex(1);

		//Prefered date time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']//input[1]")).click();
		driver.findElement(By.xpath("//span[text()='17']")).click();

		//prefered time
		Select sec=new Select(driver.findElement(By.xpath("(//div[contains(@class,'form-group col-sm-6')]//select)[2]")));
		sec.selectByVisibleText("09:00 AM - 12:00 PM");

		//Number of seats
		driver.findElement(By.xpath("(//input[contains(@class,'input-text form-control')])[3]")).sendKeys("5");

		//Name
		driver.findElement(By.xpath("//label[text()='No. of Seats']/following::input[1]")).sendKeys("Dinesh");

		//Emails
		driver.findElement(By.xpath("//label[text()='Name']/following::input")).sendKeys("dineshanbarasu3@gmail.com");

		//Mobile
		driver.findElement(By.xpath("//label[text()='Email']/following::input")).sendKeys("8645636067");

		//F&B requirements
		Select Sec3=new Select(driver.findElement(By.xpath("(//select[contains(@class,'input-text form-control')])[3]")));
		Sec3.selectByIndex(0);
		
		//other requirements
		driver.findElement(By.xpath("//label[text()='F&B Requirements']/following::input")).sendKeys("food");
		//Copy to self
		driver.findElement(By.xpath("//div[@class='form-group col-sm-6']//label[1]")).click();

		//Click on  Send Request
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		//Click Cancel button
		driver.findElement(By.xpath("(//button[@type='button']/following-sibling::button)[2]")).click();
		// Close the OTP dialog
		driver.findElement(By.xpath("(//div[@role='dialog']//button)[3]")).click();
		//Verify the ttile of the page
		System.out.println("Pagetitle: "+driver.getTitle());
		
	}

}
