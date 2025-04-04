package testngstudy;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {
	
	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("cureent title is ..."+driver.getCurrentUrl());
	//	System.out.println("title of the pagesournce is.."+driver.getPageSource());
		System.out.println("Title of the page is.."+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		Thread.sleep(3000);
		driver.close();
		
	
		
		
	}

}
