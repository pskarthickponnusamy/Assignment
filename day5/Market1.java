package week4.day5;

import java.util.List;
import java.util.Set;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Market1 {
 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.chittorgarh.com");
			
			
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("navbtn_stockmarket")).click();
	    driver.findElement(By.xpath("//a[@href='/newportal/stock-nse-bulk-deals.asp']")).click();

	    List<WebElement> lstSecurity = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
	    
	    List<String> list = new ArrayList<String>();
	    
	    for (int i = 1; i < lstSecurity.size(); i++) {
	    	
	    	String name = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]//td[3]")).getText();
	    	list.add(name);
	    	System.out.println(name);
		}
	    int size = list.size();
	    System.out.println("List Size " +size);
	   Set<String> set = new LinkedHashSet<String>(list);
	   int size2 = set.size();
	   System.out.println("Set Size"+ size2);
	   
	   if (size==size2) {
		   
		   System.out.println("Duplicate Not Removed");
		
	}
	   
	   else {
		
		   System.out.println("Duplicate Removed");
	}
	    ///WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']"));
		//List<WebElement> rows = table.findElements(By.xpath("//tbody/tr"));
		//System.out.println("Security Names:: ");
		//List<String> securityNames  = new ArrayList<String>();
		//for(int i=0;i<rows.size();i++)
		//{
			//List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			//{
			///	if(j==2)
			//	{
				//	securityNames.add(columns.get(j).getText());
			//	}
			//}
		//}
	 
	 
	 
	 
	 
}
}
///1. Launch the URL https://www.chittorgarh.com/
//2. Click on stock market
//3. Click on NSE bulk Deals
  //  hint-(Table-2)
//4. Get all the Security names
//5. Ensure whether there are duplicate Security names
