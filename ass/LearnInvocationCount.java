package week5.day2.ass;

import java.util.concurrent.ThreadPoolExecutor;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnInvocationCount {
	  @Test(invocationCount = 5 , invocationTimeOut = 1000 , threadPoolSize = 3)
	   public void CreateLead() throws InterruptedException {
		  Thread.sleep(2000);
		 System.out.println("CreatedLead");  
	   }
	   
	   @Test
	   public void EditLead() {
		   System.out.println("EditLead");
		   
	}
	   
}
