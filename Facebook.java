package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	


	// Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL https://en-gb.facebook.com/
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Click on Create New Account button
	// Step 7: Enter the first name
	// Step 8: Enter the last name
	// Step 9: Enter the mobile number
	// Step 10: Enterthe password
	// Step 11: Handle all the three drop downs
	// Step 12: Select the radio button "Female" 
	      public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver Facebook=new ChromeDriver();
			Facebook.get("https://en-gb.facebook.com");
			Facebook.manage().window().maximize();
			Facebook.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Facebook.findElement(By.linkText("Create New Account")).click();
			Facebook.findElement(By.name("firstname")).sendKeys("karthick");
			Facebook.findElement(By.name("lastname")).sendKeys("ponnusamy");
			Facebook.findElement(By.name("reg_email__")).sendKeys("9442641399");
			Facebook.findElement(By.id("password_step_input")).sendKeys("Nikitha");
			WebElement Raja = Facebook.findElement(By.id("day"));
			Select day=new Select(Raja);
			day.selectByValue("10");
			WebElement birthdaymonth =Facebook.findElement(By.id("birthday_month"));
		     Select month=new Select(birthdaymonth);
		     month.selectByVisibleText("Nov");
		     WebElement birthdayyear=Facebook.findElement(By.name("birthday_year"));
		      Select year = new Select(birthdayyear);
		     year.selectByValue("1995");
		     Facebook.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
				Facebook.findElement(By.name("websubmit")).click();
		     
	      }
			
			
			
			
			
			 
			
			
			

		}     



