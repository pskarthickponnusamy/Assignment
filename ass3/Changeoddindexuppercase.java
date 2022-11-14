package week3.day3.ass3;

public class Changeoddindexuppercase {

	
	  
public static void main(String[] args ) {
		String str="changename";
		char[]charArray=str.toCharArray();
		
		for(int i=0;i<charArray.length;i=i+2)
		{
         charArray[i]=Character.toUpperCase(charArray[i]);
		}
		
		System.out.println(charArray);
		
	}
}

