package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlert {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
			
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(30));
	driver.findElement(By.xpath("//span[text()='Show']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']//span)[2]")).click();
	
    driver.switchTo().alert().sendKeys("karthick");
    driver.switchTo().alert().accept();
	
  
    
    
    
//  driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
//	driver.switchTo().alert().accept();
//	driver.findElement(By.xpath("//span[text()='Delete']")).click();

	driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='card'])[7]//span")).click();
	driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt100']//span)[2]")).click();
	
	
	

	
	
	
	
	
	
}
}
