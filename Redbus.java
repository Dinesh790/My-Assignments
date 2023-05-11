package marathonTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) {
		/*
		01) Launch Firefox / Chrome and
    add  implicitlyWait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
02) Load https://www.redbus.in/
03) Type "Chennai" in the FROM text box
04) Click the first option from the pop up box
05) Type "Bangalore" in the TO text box
06) Click the first option from the pop up box
07) Select tomorrow's date in the Date field
08) Click Search Buses
09) Print the number of buses shown as results (101 Buses found) (use .getText())
10) Choose SLEEPER in the left menu 
11) Print the name of the second resulting bus (use .getText())
12) Get the Title of the page(use .getTitle())
		 */
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.redbus.in/");

		//to maximize
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Type "Chennai" in the FROM text box

		WebElement Fromtextbox=driver.findElement(By.xpath("//input[@class='db']"));
		Fromtextbox.sendKeys("Chennai");

		//Click the first option from the pop up box
		WebElement Subcity=driver.findElement(By.xpath("//li[@class='sub-city'][1]"));
		Subcity.click();

		//Type "Bangalore" in the TO text box
		WebElement Totextbox=driver.findElement(By.xpath("(//input[@class='db'])[2]"));
		Totextbox.sendKeys("Bangalore");

		//Click the first option from the pop up box
		WebElement Subcity1=driver.findElement(By.xpath("//li[@class='sub-city'][1]"));
		Subcity1.click();

		//Select tomorrow's date in the Date field

		WebElement Datebox=driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		Datebox.click();
		WebElement TomorrowDatebox=driver.findElement(By.xpath("//td[text()='12']"));
		TomorrowDatebox.click();

		//Click Search Buses
		WebElement searchBuses=driver.findElement(By.xpath("//button[@id='search_btn']"));
		searchBuses.click();

		//Print the number of buses shown as results (101 Buses found) (use .getText())
		WebElement text=driver.findElement(By.xpath("//span[text()='101']"));
		System.out.println(text.getText());
		
		//Choose SLEEPER in the left menu
		WebElement SleeperLeftmenu=driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/following-sibling::label[1]"));
		SleeperLeftmenu.click();
		
		//Print the name of the second resulting bus (use .getText())
		WebElement secondresults=driver.findElement(By.xpath("//div[text()='VHB Travels']"));
		System.out.println(secondresults.getText());
		
		// Get the Title of the page(use .getTitle())
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
