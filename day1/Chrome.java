package week1.day1;

public class Chrome{
	public void getName() {
		System.out.println("This is google chrome");
	}
	public void printName() {
		System.out.println("This is google chrome");
		
	}
	public static class Browser {
		public static void main (String[]args) {
			Chrome ch =new Chrome();
			ch.getName();
			ch.printName();
		}
	}
}