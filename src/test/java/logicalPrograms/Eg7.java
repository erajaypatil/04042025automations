package logicalPrograms;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Eg7 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeOptions op=new ChromeOptions();
		op.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().window().maximize();
		
		//dropdown element
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		//i wnat to select option2 

		Select s=new Select(dropdown);
		
		//use diff method select class obj provides
		
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		//s.selectByVisibleText("Option2");
		//Thread.sleep(1000);
		try {
		s.selectByValue("2");
		Thread.sleep(1000);
		}
		catch(NoSuchElementException e)
		{
			System.out.println("No such element exception handle "+e.getMessage());
		}
		System.out.println("dropdown test run successfully ");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	} 
}
