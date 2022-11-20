package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count =0;
		 List<Integer>  lista = new ArrayList<Integer>(Arrays.asList(arr));
		 Collections.sort(lista);
		 System.out.println(lista);
		 for (int i = 0; i <lista.size()-1 ; i++) {
			 count=0;
			for (int j = 0; j < lista.size(); j++) {
				
				if(lista.get(i)==lista.get(j))	{
					count=count+1;
			}
		}
         if(count>1) {
        	 
         
		System.out.println("this duplicate"+lista.get(i));
	}

}
}
}

// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count 
	
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	
			// compare both the loop variables & check they're equal
		
					// print the matching value
			
	
	