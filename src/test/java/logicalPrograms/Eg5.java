package logicalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Eg5
{
public static void main(String[] args) throws InterruptedException 
{
	

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/reg/"); 
	driver.manage().window().maximize();
	 WebElement day = driver.findElement(By.id("day"));
	 Actions ac=new Actions(driver);
	 ac.click(day).perform();
	 ac.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
	 
	 for(int i=1;i<=15;i++)
	 {
		 ac.sendKeys(Keys.ARROW_UP).perform();
		 Thread.sleep(2000);
	 }
	 ac.sendKeys(Keys.ENTER).perform();
	 
	 WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
	 ac.sendKeys(name, "Ajay").perform();
	 Thread.sleep(2000);
	 Reporter.log("Test run successfully",true);
	driver.close();
	
}
}
