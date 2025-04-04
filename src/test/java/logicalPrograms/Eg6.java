package logicalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Eg6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php"); 
		driver.manage().window().maximize();
	//	 WebElement day = driver.findElement(By.id("day"));
		
		WebElement clickbutton=driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		WebElement rightClick=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		
		WebElement doubleclickbutton=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		 Actions ac=new Actions(driver);
		 
		 ac.click(clickbutton);
		 Thread.sleep(2000);
		 ac.contextClick(rightClick).build().perform();
		 Thread.sleep(2000);
		 ac.doubleClick(doubleclickbutton).build().perform();
		 Thread.sleep(1000);
		 
		 Reporter.log("Test run successfully ",true);
		 
		 driver.close();
		 
		 
		 
		
	}
}
