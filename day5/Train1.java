package week4.day5;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Train1 {
private static ArrayList<String> Listlsttrain;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://erail.in/");

	//Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement fromtrain = driver.findElement(By.id("txtStationFrom"));
	fromtrain.clear();
	fromtrain.sendKeys("TPJ",Keys.TAB);
	WebElement totrain = driver.findElement(By.id("txtStationTo"));
	totrain.clear();
	totrain.sendKeys("MS",Keys.TAB);
	//check the sort checkbox
	driver.findElement(By.id("chkSelectDateOnly")).click();
	WebElement table = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]"));
	table.getText();
	java.util.List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr"));
	System.out.println(rows.size());
	Listlsttrain=new ArrayList<String>();
	for (int i = 2; i < rows.size(); i++) {
		
	
	String text = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr["+i+"]/td[2]")).getText();
	System.out.println(text);
	
	
	
	if(text.contains("CHENNAI")) {
		
		System.out.println("Name contain chennai"+text);
	}
	
	
	}
}
}
