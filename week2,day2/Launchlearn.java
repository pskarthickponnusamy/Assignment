package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchlearn {

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
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("pskar");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ponnusamy");
	driver.findElement(By.id("createLeadForm_dataSourceId")).click();
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("karthick");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("karthick");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("ponnusamy");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pskarthick@pskar.com");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());
	}
}
