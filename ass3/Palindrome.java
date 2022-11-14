package week3.day3.ass3;

import java.util.Iterator;

public class Palindrome {
	
public static void main(String[] args) {
	String str= "madam";
	String rev="";
	for (int i = str.length()-1; i >0; i--) {
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev)) {
		System.out.println(str+"is palindrome");
	}
	else {
		System.out.println(str+"is not palindrome");
		
	}
}
}

	

