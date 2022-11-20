package week3.day4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicate {
public static void main(String[] args) {
	String str ="We learn java basics as part of java sessions in java week1";
	 int count=0;
	 String[] split = str.split (" ");
	 List<String> list1 = new ArrayList<String>(Arrays.asList(split));
	 
	 for(int i=0; i< list1.size();i++) {
	for(int j=i+1;j<list1.size();j++) {
		if(list1.get(i).equals(list1.get(j))) {
		list1.remove(j);
		
		}
		}
		}
	
	
		 System.out.println(list1);
		 Set<String> set = new LinkedHashSet<String>(Arrays.asList(split));
		 System.out.println(set);
	 }
	 
	  
}




