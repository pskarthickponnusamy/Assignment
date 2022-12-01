package week4.day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {;
public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/ ");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement builder = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(builder).perform();
	    driver.findElement(By.xpath("//div[@id='scroller-container']/div[7]/a[1]")).click();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//button[@class=' css-n0ptfk']//span[1]")).click();
	    driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	    driver.findElement(By.xpath("//span[@class='title ']")).click();
	    Thread. sleep (2000);
	    driver.findElement(By.xpath("(//div[@class=' css-b5p5ep'])[2]")).click();
	    driver.findElement(By.xpath("//div[@class=' css-b5p5ep']")).click();
	    driver.findElement(By.xpath("//div[@class='control-value']")).click();
	    driver.findElement(By.xpath("//span[text()='Concern']")).click();
	    driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	    String text = driver.findElement(By.xpath("//span[text()='Filters Applied']")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("//div[@class='css-1rd7vky']//div")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String>lstwindow =new ArrayList<String>(windowHandles);
	    driver.switchTo().window(lstwindow.get(1));
	    driver.findElement(By.tagName("select")).click();
	    driver.findElement(By.xpath("(//select[@title='SIZE']//option)[2]")).click();
	    String text2 = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
	    System.out.println(text2);
	    driver.findElement(By.xpath("//button[@class=' css-12z4fj0']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
	    WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	    driver.switchTo().frame(frame);
	    Thread.sleep(2000);
	    String text3 = driver.findElement(By.xpath("//span[@class='css-n8gwxi e171rb9k3']")).getText();
	    System.out.println(text3);
	    
	    driver.findElement(By.xpath("//div[@class='css-ltzjhp e25lf6d7']")).click();
	    
	   // driver.findElement(By.linkText("Continue as guest")).click();
	    driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
	//=============
			//1) Go to https://www.nykaa.com/
			//2) Mouseover on Brands and Search L'Oreal Paris
			//3) Click L'Oreal Paris
			//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
			//5) Click sort By and select customer top rated
			//6) Click Category and click Hair->Click haircare->Shampoo
			//7) Click->Concern->Color Protection
			//8)check whether the Filter is applied with Shampoo
			//9) Click on L'Oreal Paris Colour Protect Shampoo
			//10) GO to the new window and select size as 175ml
			//11) Print the MRP of the product
			//12) Click on ADD to BAG
			//13) Go to Shopping Bag 
			//14) Print the Grand Total amount
			//15) Click Proceed
			//16) Click on Continue as Guest
			//17) Check if this grand total is the same in step 14
			//18) Close all windows

	
	
