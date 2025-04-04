package logicalPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Eg1 
{
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement actual = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		
		String expected="Create a new account";
		
		if(actual.equals(expected))
		{
			System.out.println("actual and expected result match successfully ");
		}
		else
		{
			System.out.println("actual and expected result not match ");
		}
		Thread.sleep(2000);
		//isSelected method use
		
		 WebElement radiobutton1 = driver.findElement(By.xpath("(//input[@id='sex'])[1]"));
		 radiobutton1.click();
		 
		 if(radiobutton1.isSelected())
		 {
			 System.out.println("Radiobutton is selected sucessfully ");
		 }
		 else
		 {
			 System.out.println("Radiobutton is not selected successfully ");
		 }
		 
		System.out.println("Create new account is display on webpage "+actual.isDisplayed());
		
		WebElement buttonsignup=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		
		System.out.println("Facebook signup button is Enable "+buttonsignup.isEnabled());
		
		WebElement textboxmobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		System.out.println("Textbox is enable  "+textboxmobile.isEnabled());
		
		Thread.sleep(2000);
		
		Reporter.log("Test Script run successfully",true);
		System.out.println("Hi it me ajay rokade comming to github repository");
		System.out.println("joooooooooooo");
		driver.close();
	
	}
}
