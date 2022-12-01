package week4.day5;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Libary1 {
public static void main(String[] args){
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://html.com/tags/table");
		
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> karthick = driver.findElements(By.xpath("//table//tr[1]//td[2][1]"));
	for (int i = 0; i <karthick.size(); i++) {
		
		System.out.println(karthick.get(i).getText());
	}
		
	}
	
	
}
