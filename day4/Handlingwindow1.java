package week4.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingwindow1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/window.xhtml");
			
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(30));
	//driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']")).click();
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();	
	Set<String> windowHandles = driver.getWindowHandles();
 List<String>lstwindow =new ArrayList<String>(windowHandles);
 driver.switchTo().window(lstwindow.get(1));
	String title = driver.getTitle();
	System.out.println(title);
	String windowHandle1 = driver.getWindowHandle();
	System.out.println(windowHandle1);
  driver.switchTo().window(lstwindow.get(0));
   driver.findElement(By.xpath("//h5[text()='Close all windows except Primary']")).click();
    driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
    String windowHandle2 = driver.getWindowHandle();
	Set<String> windowHandles1 = driver.getWindowHandles();
	List<String>lstwindow1 =new ArrayList<String>(windowHandles1);
	driver.switchTo().window(lstwindow.get(1));
    driver.switchTo().window(lstwindow.get(0));
    
    driver.findElement(By.xpath("//span[text()='Open Multiple']"));
    
    String windowHandle21 = driver.getWindowHandle();
	Set<String> windowHandles11 = driver.getWindowHandles();
	int size = windowHandles11.size();
	System.out.println(size);
	//List<String>lstwindow11 =new ArrayList<String>(windowHandles11);
	
}
}

