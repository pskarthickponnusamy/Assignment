package week1.day1;

public class Mobile {
  public void Makecall() {
	  String mobilemodel="one plus 8 pro";
	  float mobileweight=170.7f;
	  System.out.println("This is my mobile and model is "+mobilemodel);
	  System.out.println("This is my mobile and weight is "+mobileweight+"grams");
	  
  }
  public void sendMsg() {
	  boolean isfullcharged=true;
	  int mobilecost=2000;
	  System.out.println("This is my mobile is fullcharged: "+isfullcharged);
	  System.out.println("This is my mobile cost is  "+mobilecost);
	  
  }
  public static void main(String[] args) {
	  Mobile m=new Mobile();
	  System.out.println("This is my mobile");
	  m.Makecall();
	  m.sendMsg();
	  
  }
   
}
	  
	

