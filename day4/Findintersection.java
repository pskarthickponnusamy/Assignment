package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findintersection {
public static void main(String[] args) {
	Integer []a={3,2,11,4,6,7};
	Integer []b={1,2,8,4,9,7};
	 List<Integer> lista = new ArrayList<Integer>(Arrays.asList(a));
	 List<Integer> listb = new ArrayList<Integer>(Arrays.asList(b));
	System.out.println( lista); 
	System.out.println(listb);
	for (int i = 0; i < lista.size(); i++) {
		for (int j = 0; j < listb.size(); j++) {
			if(lista.get(i).equals(listb.get(j))) {
				System.out.println(lista.get(i));
			}
		}
	}
}
}
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	

