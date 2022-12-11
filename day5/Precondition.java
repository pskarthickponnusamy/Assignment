package week5.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Precondition {
public ChromeDriver driver;
@BeforeMethod
public void PreCondition() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
}@AfterMethod
	public void PostCondition() {
	driver.close();
		
	}
}











//1. Create BaseClass with preCondition() and postCondition() with @BeforeMethod and @AfterMethod 
//2. Move the common code from all the 5 testcases into preCondition() and postCondition()
//3. Extend the DuplicateLead and MergeLead test cases with BaseClass and execute sequentially and parallely using testng.xml
