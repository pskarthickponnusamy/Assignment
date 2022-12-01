package week4.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowColumn {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://html.com/tags/table");
		
		
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> Col = driver.findElements(By.xpath("//div[@class='render']//table//th"));
		System.out.println(Col.size());
		List<WebElement> Ro = driver.findElements(By.xpath("//div[@class='render']//table//tr"));
		System.out.println(Ro.size());
		

	
	
	
	
	
}
}


///1. Launch the URL https://html.com/tags/table/
///2. Get the count of number of rows
////3. Get the count of number of column.
