package week3.day3.ass3;


public class Reversename {


//Classroom Assignment 1 A: Reverse the Name
//Goal: To understand the String, loop
//) Create a class by name: ReverseString (with main method) in same package(week3.day1)
//b) Write a logic to reverse a String
//c) Run and Confirm the reversed String is printed in console
//Hint: Convert the String to characters, get the characters in reverse order and 
//print every character without white space.
public static void main(String[] args) {
	String reverse="Reverse String";
	char[] charArray = reverse.toCharArray();
	System.out.println(charArray);
	for(int i=charArray.length-1;i>=0;i--){
		System.out.print(charArray[i]);
	}
}
	}
		
			
			
		
	
	

	
