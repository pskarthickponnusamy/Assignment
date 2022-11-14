package week3.day3.ass3.org.student;

import week3.day3.ass3.org.department.Department;

public class Student extends Department  {
	
public void studentName() {
	System.out.println("studentName");
	
}
public void studentDept() {
	System.out.println("studentDept");
}
public void studentId() {
	System.out.println("studentId");
}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collgeName();
		obj.collgeCode();
		obj.collgeRank();
		obj.deftName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();

	}

}
//Package   :org.student
////Class        :Student
//Methods   :studentName(),studentDept(),studentId()

////Description:
/// above 3 class and call all your class methods into the Student using multilevel inheritance.