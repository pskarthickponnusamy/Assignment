package week4.day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Train {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		
		
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// List<WebElement> names = driver.findElements(By.xpath("table[@class=\"// Find all the train names using xpath and store it in a list 	"));
 List<String> trainNameList = new ArrayList<String>();
 
 List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[2]/td[2]"));
 int size = trainNames.size();
 System.out.println(size); 
 Thread.sleep(2000);
 for (int i = 1; i <=size; i++) { 
	 

	String arrange = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]")).getText();
	trainNameList.add(arrange);
	Collections.sort(trainNameList);
 System.out.println(trainNameList); 
 }
}
}
 
//	for (int i = 0; i <names.size(); i++) {
		//System.out.pri





//table[@class="// Find all the train names using xpath and store it in a list 		List<String> trainNameList = new ArrayList<String>(); 		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")); 		int size = trainNames.size(); 		System.out.println(size); 		Thread.sleep(2000); 		// Use Java Collections sort to sort it and then print it 		for (int i = 1; i <= size; i++) { 		String arrange = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]")).getText(); 		trainNameList.add(arrange); 		Collections.sort(trainNameList); 		} 		System.out.println(trainNameList); 		}
//table[@class='Dabble TrainList 
//TrainListHeader
//stickyTrainListHeader']//tr[2]/td[2]