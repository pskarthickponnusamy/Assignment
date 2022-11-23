package week4.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/frame.xhtml");
			
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(30));
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("Click")).click();
	driver.switchTo().defaultContent();
	List<WebElement> frameSize = driver.findElements(By.tagName("iframe"));
	int size = frameSize.size();
	System.out.println(size);
	
	driver.switchTo().frame(2);
	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	driver.switchTo().frame(3);
	driver.findElement(By.xpath("Click")).click();
	
	
	
	
	
}
}
