package testngstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting {
	
	@Parameters("browserName")
	@Test
	public void corssbrowser(String browserName)
	{
		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selinium\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
		
		}
		else if(browserName.equals("firefox"))
		{
			
			System.setProperty("webdriver.firefox.driver","C:\\selinium\\firefox\\geckodriver-v0.33.0-win32\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
	}

}
