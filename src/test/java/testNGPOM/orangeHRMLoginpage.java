package testNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHRMLoginpage {

	
	@FindBy(xpath="//input[@name='username']") private WebElement username;
	
	@FindBy()private WebElement password;
	
	@FindBy() private WebElement button;
	
	
	public void orangeHRMLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Sendusername(String userName)
	{
		username.sendKeys(userName);
	}
	
	public void Sendpassword(String userPassword)
	{
		password.sendKeys(userPassword);
	}
	
	
	public void Sendbutton()
	{
		button.click();
	}
}
