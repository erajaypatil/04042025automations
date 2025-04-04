package testNGstudy1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExpandTesting
{

	@Test
	public void expandTesting() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("current url is "+driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//driver.findElement(By.id("search-input")).sendKeys("1254456");
		//driver.findElement(By.cssSelector("input#id")).sendKeys("14562354");
		//driver.findElement(By.xpath("//span[text()='Close']")).click();
		
		//driver.findElement(By.id("examples-dropdown")).click();
		//driver.findElement(By.cssSelector("a#examples-dropdown")).click();
		
//		WebElement rightclickbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
//		
		Actions ac=new Actions(driver);
//		ac.contextClick(rightclickbutton).perform();
//		ac.click();
//		
//		
//		Thread.sleep(2000);
//	
//		//double click on button using actions class
//		
//	 WebElement oubleclickbutton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//	 ac.doubleClick(oubleclickbutton).perform();
//	 Thread.sleep(2000);
//		//handle alert popup
//
//		Alert al=driver.switchTo().alert();
//		al.accept();
		
		
		//drag and drop opeeration on element 
		//WebElement dragpart=driver.findElement(By.xpath("//a[text()=' 5000']"));
		//WebElement dragpart=driver.findElement(By.xpath("//a[text()=' LOAN ']"));
		Thread.sleep(2000);
		//WebElement droppart=driver.findElement(By.id("loan"));
		
		//WebElement ammoutfield=driver.findElement(By.id("amt8"));
		//ac.dragAndDrop(dragpart, droppart).build().perform();
		
		//keyboard actions
		
		//act.sendkeys(keys.ArrowUp).perform();
		
		//WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rokadepatil");
		Thread.sleep(2000);
		
		driver.findElement(By.id("day")).click();
		
		ac.sendKeys(Keys.ARROW_UP).build();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("ajay");
		
		
		Thread.sleep(5000);
		System.out.println("test run successfully");
		driver.close();
		
		
		
	}
}
