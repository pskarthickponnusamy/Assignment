package week4.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amozan {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://www.amazon.in/");
		
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 9 bro",Keys.ENTER);
	
   String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println(text);
	
	
	  String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base puis-light-weight-text s-link-centralized-style'])[1]")).getText();
	 
	 System.out.println(text2);
	  driver.findElement(By.xpath(" (//i[contains(@class, 'aok-align-bottom')])[1]")).click();
	 String text3 = driver.findElement(By.xpath("//table[@id='histogramTable']/tbody[1]/tr[1]/td[3]/span[2]/a[1]")).getText();
	 System.out.println(text3);
	 driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[2]")).click();
	 Set<String> windowHandles = driver.getWindowHandles();
	    List<String>lstwindow =new ArrayList<String>(windowHandles);
	    driver.switchTo().window(lstwindow.get(1));
	    File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	    File target =  new File ("./report/img.png");
	    FileUtils.copyFile(screenshotAs, target);
	    driver.findElement(By.id("add-to-cart-button")).click();
	    String text4 = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
	   // String replaceAll = text4.replaceAll("\\D","");
	   // int parseInt = Integer.parseInt(replaceAll);
	    //System.out.println(parseInt);
	    if(text.equals(text4)){
	    	System.out.println("same");
	    }
	    else {
	    	System.out.println("not same");
	    }
	
}
}








//Amazon:
//1.Load the uRL https://www.amazon.in/
//2.search as oneplus 9 pro 
//3.Get the price of the first product
//4. Print the number of customer ratings for the first displayed product
//5. Mouse Hover on the stars
//6. Get the percentage of ratings for the 5 star.
//7. Click the first text link of the first image
//8. Take a screen shot of the product displayed
//9. Click 'Add to Cart' button
//10. Get the cart subtotal and verify if it is correct.
