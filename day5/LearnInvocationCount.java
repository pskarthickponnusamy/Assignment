package week5.day5;

import org.testng.annotations.Test;

public class LearnInvocationCount {
@Test(invocationCount = 5,invocationTimeOut =  1000,threadPoolSize=10)

public void CreateLead() throws InterruptedException{
	Thread.sleep(2000);
	System.out.println("college ");
}
@Test
public void EditLead() {
	System.out.println("panimalar");
}

}
