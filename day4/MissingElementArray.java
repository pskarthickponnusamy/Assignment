package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementArray {
public static void main(String[] args) {
	Integer[] arr = {1,2,3,4,7,6,8};
	List<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
	Collections.sort(a);
	System.out.println(a);
	for (int i = 0; i < a.size()-1; i++) {
		if((a.get(i)+1)!=a.get(i+1)) {
			System.out.println(a.get(i)+1);
		}	
	}
		
	}
}

//Here is the input
		

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				