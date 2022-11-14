package week3.day3.ass3;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String input1  ="race";
	String input2  ="care";
	char[] ch1=input1.toCharArray();
	char[] ch2=input2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1, ch2)) {
		
		System.out.print("Anagram");
	
		
	}
	else {
		System.out.print("Not Anagram");
	}

}
}
	


