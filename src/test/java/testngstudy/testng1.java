package testngstudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng1 {
	
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		System.out.println("cureent title is ..."+driver.getCurrentUrl());
		System.out.println("Title of the page is.."+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		String actual="https://vctcpune.com/";
	
		Assert.assertEquals("https://vctcpune.com/", actual);
		Thread.sleep(3000);
		driver.close();
	}

}
