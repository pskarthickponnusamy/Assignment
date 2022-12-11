package week5.day5;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnProirity {
@Test(priority = 1)
public void createlead() {
	System.out.println("createlead");
}
@Test(priority = -1)
public void editlead() {
	System.out.println("editlead");
}
@Ignore
public void deletelead() {
	System.out.println("deletelead");
}





//private void deletelead() {
	// TODO Auto-generated method stub
	
}

