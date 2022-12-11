package week5.day2.ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CreateNewProposal {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://dev76708.service-now.com ");
		
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("m^D4vrMkV=R1");
	driver.findElement(By.id("sysverb_login")).click();
	// karthick.setImplicitWait(10);
	  Shadow karthick = new Shadow(driver);
	  karthick.setImplicitWait(10);
	 karthick.findElementByXPath("//div[text()='All']").click();
	  
	  karthick.setImplicitWait(10);
	  karthick.findElementByXPath("//input[@id='filter']").sendKeys("My Proposals",Keys.ENTER);
	  karthick.findElementByXPath("//span[@class='item-icon']").click();
	  WebElement element = karthick .findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath(" //button[@id='sysverb_new']")) .click();
		driver.findElement(By.xpath("//span[@class='label-text']/following::input[40][1]")).sendKeys("nikitha  is good");
		driver.findElement(By.xpath("(//span[text()='Change Request values'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='s2id_autogen6_search'][1]")).click();
		//driver.findElement(By.xpath("(//span[@class='select2-chosen'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='s2id_autogen6_search']")).sendKeys("Review Comments");
		driver.findElement(By.xpath("//span[text()='Review comments']")).click();
		driver.findElement(By.xpath("(//textarea[@class='filerTableInput form-control'])[1]")).sendKeys("Good product");
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		driver.close();
		
	 
}
	
	
	
	
}






















//"1. Launch ServiceNow application
//2. Login with valid credential 
//3. Click All and Enter Proposal in filter navigator and press enter 
//4. Click- new  and  fill mandatory fields and click 'Submit' 
//Button.
//5. Verify the successful creation of new Proposal"
