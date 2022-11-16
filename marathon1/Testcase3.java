package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Testleaf$321");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.className("slds-icon-waffle")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Task");
    driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
    driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
    driver.findElement(By.xpath("//a[@title='New Task']")).click();
    driver.findElement(By.xpath("//a[@class='select']")).click();
    driver.findElement(By.xpath("//input[contains(@class,'slds-combobox__input slds-input')]")).sendKeys("Bootscamp");
    driver.findElement(By.xpath("(//button[@data-aura-class='uiButton forceActionButton'])[3]")).click();
	String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds')]/a")).getAttribute("title");
		if(attribute.contains("Bootcamp")) {
			System.out.println(attribute+" Task Created");
		}else {
			System.out.println(attribute+" Task not Created");
		}
		driver.close();
	}

}
    
    
    
	

	
	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	//1) Launch the browser
	//2) Click Login
	//3) Login with the credentials(user name,password)
	//4) Click on Global Actions SVG icon(App Launcher)
	//5) Click view all
	//6) Type task and select task
	//7) Click New Task under dropdown icon
	//6) Enter subject as "Bootcamp "                                               
	//8) Select status as 'Waiting on someone else'
	//9) Save and verify the 'Task created' message

