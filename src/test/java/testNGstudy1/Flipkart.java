package testNGstudy1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart
{
	@Test
	public void flipkartTest() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("current url is "+driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
      //  WebElement text=driver.findElement(By.xpath("(//div[@class='_3ETuFY'])[8]"));     
        Thread.sleep(2000);
      //  List<WebElement> text1=driver.findElements(By.xpath("//div[@class='_1ui5b4']"));
      //  System.out.println("size of the elements "+text1.size());
        
		System.out.println("run succesfully");
		driver.close();
		
		
		
	}

}
