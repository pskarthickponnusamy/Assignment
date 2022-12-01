package week4.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {


public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://html.com/tags/table");
		
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> library  = driver.findElements(By.xpath("(//table//tr[2])[1]"));
	for (int i = 0; i < library.size(); i++) {
		
		System.out.println(library.get(i).getText());
		
	}
	
	
	System.out.println(library.size());

	
    
	
	
	
}
}
//1. Launch the URL https://html.com/tags/table/
//2. You have to print the respective values based on given Library
//(hint: if the library was absolute usage, then print all its value