package logicalPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Eg4 
{
public static void main(String[] args) 
{
	//start-maximized
	//incognito
	//disable-notification
	//--headless=chrome
	
	ChromeOptions op=new ChromeOptions();
	System.out.println(op.addArguments("headless=chrome"));
	WebDriver driver=new ChromeDriver(op);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
	//driver.manage().window().maximize();
	Reporter.log("Eg4 is run ");
	System.out.println("Eg4 run successfully ");
	driver.close();
  
}
}
