package week3.day3.ass3;

public class bmw extends car {
	public void Abs() {
		System.out.println("Abs");
	}
	public static void main(String[] args) {
		bmw obj=new bmw();
		obj.applyBreak();
		obj.soundHorn();
		obj.Abs();
	}
	}


