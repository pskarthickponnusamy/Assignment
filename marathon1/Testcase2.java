package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Testleaf$321");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.className("slds-icon-waffle")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement opper = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();",opper);
	driver.findElement(By.xpath("//div[@title='New']")).click();
	driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("karthickraja");
	driver.findElement(By.xpath("//strong[text()='karthickraja']")).click();
	driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("karthickraja");
	driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("11/15/2022");
    driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
    driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
    String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds')]/a")).getAttribute("title");
    
	if(attribute.contains("karthickraja")) {
		System.out.println(attribute+" Opportunity Created");
	}else {
		System.out.println(attribute+" Opportunity not Created");
	}
	driver.close();
}
}	
	   
		
	    
	
			
	
	
	
	
	
	
	
	
	
	
   
    
    
	
	
//enter username
	
//enter password

//click login button
//Click on toggle menu button from the left corner
	
//Click view All and click Sales from App Launcher
	
//Click on Opportunity tab 
	
//Click on New button

//Enter the Oppertunity name
	
//Enter 'your name' as account name
	
//choose close date
	
//click stage(Needs Analysis)
						
//click save
	
//verify message
	
//Close the Browser


	
			
		


