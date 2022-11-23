package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mergecontact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement( By.xpath("(//img[@alt='Lookup'])")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>lstwindow =new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstwindow.get(1));
		//driver.findElement (By.xpath("(//input[contains(@class,'x-form-text x-form-field')])[2]")).sendKeys("Karthickraja");
		//driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(lstwindow.get(0));
		driver.findElement( By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>lstwindow1 =new ArrayList<String>(windowHandles1);
		driver.switchTo().window(lstwindow1.get(1));
			Alert alert = driver.switchTo().alert();
		alert.accept();
	
	


driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		driver.switchTo().window(lstwindow.get(0));
		
		
		driver.findElement(By.linkText("Merge")).click();
		
	}
}
	