package practiceprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Actionss1 
{
public static void main(String[] args) throws InterruptedException
{


	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	
	//Actions class
	
	System.out.println("line25");
	//1.doubleclick
	WebElement doubeclick1=driver.findElement(By.xpath("//span[text()='right click me']"));
	System.out.println("line28");
	Actions act=new Actions(driver);
	System.out.println("line30");
	act.click();
	System.out.println("line32");
//	act.doubleClick();
	Thread.sleep(2000);
//	act.doubleClick(doubeclick1);
	Reporter.log("pro run successfully");
	System.out.println("pro run successfully");
	driver.close();
	
	
}	
}
