package logicalPrograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg8 
{
public static void main(String[] args) throws InterruptedException, IOException 
{

	//takescreenshot syntax
	String timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()); 
	
	//webdriver launch
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/");
	driver.manage().window().maximize();
	
	
	//wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	//popup handleling
	WebElement Links=driver.findElement(By.linkText("Links"));
	Links.click();
	
	//window id of main browser
	String idofmainpage=driver.getWindowHandle();
	System.out.println(idofmainpage);
	
	//open newtab popup
	WebElement NewTab=driver.findElement(By.name("NewTab"));
	NewTab.click();
	
	//winodw ids of every browser
	Set<String> Allidsofbrowsers=driver.getWindowHandles();
	
	//to traverse from windowbrowsers use arraylist obj
	Iterator<String> idswindow = Allidsofbrowsers.iterator();
	
	String mainpageid=idswindow.next();
	String childpageid=idswindow.next();
	
	System.out.println("mainpage browser id "+mainpageid);
	System.out.println("childbrowser popup id "+childpageid);
	
	
	//take screenshot of page
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//String ra = RandomString.make(3);
	
	File dest=new File("C:\\selenium1\\screenshot"+timestamp+".png");
	
	FileHandler.copy(src,dest);
	
	Thread.sleep(2000);
	//take control of windows
    driver.switchTo().window(childpageid);
    
    //use java scriptexecutor
    
    JavascriptExecutor js=((JavascriptExecutor)driver);
    js.executeScript("window.scrollBy(200,800)");
    js.executeScript("window.scrollBy(200,-800)");
    js.executeScript("window.scrollBy(-200,800)");
    js.executeScript("window.scrollBy(-200,-800)");
	
	WebElement emailtextbox=driver.findElement(By.xpath("(//input[@name='email'])[2]"));
	emailtextbox.sendKeys("ajayrokadepatil00123");
	
	
	Thread.sleep(10000);
	System.out.println("popup handle succesfully ");
	Thread.sleep(5000);
	//close driver
	//driver.close();
	driver.quit();
	
	
	
}
}
