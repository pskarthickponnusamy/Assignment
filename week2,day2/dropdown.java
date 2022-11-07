package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[]args){
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(30));
		WebElement findElement =driver.findElement(By.className("ui-selectonemenu"));
	   Select At=new Select(findElement);
		At.selectByIndex(2);
	}
		
	}
	
	


