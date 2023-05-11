package marathonTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		/*
		 * 01) Launch Chrome  
02) Load https://www.amazon.in/
     add  implicitlyWait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Bags" in the Search box
04) Choose the 	 item in the result (bags for boys)
05) Print the total number of results (like 50000)
    1-48 of over 50,000 results for "bags for boys"
06) Select the first 2 brands in the left menu
    (like American Tourister, Generic)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser(driver.close())	

		 */
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		//to maximize
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Type "Bags" in the Search box
		WebElement Searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Searchbox.sendKeys("Bags");
		// Choose the 	 item in the result (bags for boys)
		WebElement ChooseItem=driver.findElement(By.xpath("//span[text()=' for boys']"));
		ChooseItem.click();
		//Print the total number of results (like 50000)
		//1-48 of over 50,000 results for "bags for boys"

		String strResults=driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();
		strResults=strResults.substring(strResults.indexOf("over"));
		strResults=strResults.replaceAll("[^0-9],", "");
		System.out.println("The Total numbers of result is: "+strResults);
		
		// Select the first 2 brands in the left menu,(like American Tourister, Generic)
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]//i)[3]")).click();
		//Java script click
		WebElement element = driver.findElement(By.xpath("//li[@id='p_89/Generic']/span[1]/a[1]/div[1]/label[1]/i[1]"));
        driver.executeScript("arguments[0].click();", element);
        
        //
        driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        // Print the first resulting bag info (name, discounted price)
        
       System.out.println("Item names: "+driver.findElement(By.xpath("//a[contains(@class,'a-link-normal s-underline-text')]//span")).getText());
       System.out.println("Items price: "+driver.findElement(By.xpath("//span[text()='4,799']")).getText());
       
       System.out.println("Page title: "+driver.getTitle());
		
	}

}
