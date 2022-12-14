package week7assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass  {
	
	 RemoteWebDriver  driver;
	String excell;
	@Parameters({"url","username","password"})
	@BeforeMethod
public  void launchBrowser(String urllink,String uname,String pword) {
		
	 driver= new ChromeDriver();
		driver.get(urllink);
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys(uname);
		driver.findElement(By.id("user_password")).sendKeys(pword);
		driver.findElement(By.id("sysverb_login")).click();		}
	   // private static void get(String string) {
		// TODO Auto-generated method stub
		
		@AfterMethod
	public void tearDown() {
	    	
		//	driver.close();
	
		
		
		
		
		}
	
	
	
}

