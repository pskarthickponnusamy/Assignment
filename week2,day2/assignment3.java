package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		// TODO Auto-generated method stub
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	 String  title= driver.getTitle();
	 System.out.println(title);
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Karthick");
	driver.findElement(By.id("lastNameField")).sendKeys("ponnusamy");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("pskarthick@pskar.com");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());
	System.out.println("First Name : Karthick");
	System.out.println("Browser Name : CHROME");
	System.out.println(driver.getTitle());
	driver.close();
	}
}
