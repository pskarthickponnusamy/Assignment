package week4.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classroom1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://testleaf.herokuapp.com/pages/table.html");
		
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //Get the column count
	List<WebElement> column = driver.findElements(By.xpath("//table//th"));
    System.out.println(column.size());
    for (int i = 0; i < column.size(); i++) {
    System.out.println(column.get(i).getText());
    }
    List<WebElement> tag = driver.findElements(By.tagName("th"));
    System.out.println(tag.size());
    
    
    //Get the row count
    List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
    System.out.println(row.size());
    //print particular data
    String text = driver.findElement(By.xpath("//table//tr[3]/td[2]")).getText();
    System.out.println(text);
}
}
