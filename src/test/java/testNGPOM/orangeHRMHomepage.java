package testNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHRMHomepage {
	
	@FindBy(xpath="//div[@class='oxd-topbar-header-title']")private WebElement userid;
	
	
	
	public void orangeHRMHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String useridvalidation()
	{
		String Actualuserid=userid.getText();
		
		return Actualuserid;
	}

}
