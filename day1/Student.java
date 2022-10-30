package week1.day1;

public class Student {
private void reportCard() {
	String studentName="KARTHICKRAJA";
	int rollNo =2116;
	String collegeName = "PANIMALAR";
	short markScored =937;
	float cgpa =6.00f;
System.out.println(studentName);
System.out.println(rollNo);
System.out.println(markScored);
System.out.println(cgpa);
}
public static void main(String[] args) {
	Student o = new Student();
	o.reportCard();
}
}
