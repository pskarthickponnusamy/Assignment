package week5.day2.ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ServiceNow {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://dev76708.service-now.com ");
		
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("m^D4vrMkV=R1");
	driver.findElement(By.id("sysverb_login")).click();
	
	  Shadow karthick = new Shadow(driver);
	  karthick.setImplicitWait(10);
	 karthick.findElementByXPath("//div[text()='All']").click();
	karthick.findElementByXPath("//span[text()='Service Catalog']").click();
	WebElement element = karthick.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(element);
	driver.findElement(By.xpath("//h2[text()[normalize-space()='Mobiles']]")).click();
	driver.findElement(By.xpath("//a[@class='service_catalog']//h2")).click();
	driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
	driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
	
	driver.findElement(By.xpath("//label[text()='Pink']")).click();
	driver.findElement(By.xpath("//label[text()='128 GB']")).click();
	//driver.findElement(By.id("IO:33494b069747011021983d1e6253af45")).click();
	WebElement drop1 = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
	Select dp1= new Select(drop1);
	dp1.selectByIndex(1);
	 driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	
	
String text = driver.findElement(By.xpath("//a[@id='requesturl']//b[1]")).getText();
	System.out.println("Thank you, your request has been submitted Request Number: "
			+text);
	driver.close();
	
	
	
	
	
	 
	    
	
	
	
		
		
	
	
	
	
	
	
      
	
	
	
	
	
	
	
}
}










//1. Launch ServiceNow application
//2. Login with valid credentials username as admin and password as India@123
//3. Click-AllEnter Service catalog in filter navigator and press enter 
//4. Click on  mobiles
//5.Select Apple iphone6s
//6.Update color field to rose gold and storage field to 128GB
//7.Select  Order now option
//8.Verify order is placed and copy the request number