package week3.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList {
	/*
	 *  //Load the url(https://www.amazon.in/)
    //Search for mobiles in the search box ad click Enter
    //get all the mobile price
        List<WebElement> prices = driver.findElements(By.className("a-price-whole"));    
        //Iterate through for each loop and get text
        //After getting the text-It will print some white spaces
        //to remove comma from the text
        //String replaced String = text.replaceAll(",","");
        //Convert String to Integer
      //Declare a list 
      //List<Integer> list = new ArrayList<>();
      for(){
         if (!replacedString.isEmpty()) {
//            //int numbers = Integer.parseInt(replaced String);
         list.add(numbers);
//        }   
      }
      //Print list
      //Sort the list
      //print the least mobile price(Hint:use get())
	 */



	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		//to maximize
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	   //Search for mobiles in the search box ad click Enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
		
		
		
	}

}
