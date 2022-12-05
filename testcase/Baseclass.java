package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  {
	public 	ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
public  void launchBrowser(String urllink,String uname,String pword) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get(urllink);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();
		}
	   // private static void get(String string) {
		// TODO Auto-generated method stub
		
		@AfterMethod
	public void tearDown() {
	    	
			driver.close();
	}
	
	
	
}

