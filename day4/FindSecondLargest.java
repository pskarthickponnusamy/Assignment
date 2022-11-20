package week3.day4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		//Arrays.sort(data);
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			lista.add(data[i]);	
			
		}
		Collections.sort(lista);
		System.out.println("second largest number"+lista.get(lista.size()-2));
	}

}

// Here is the input



/*
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it
 */