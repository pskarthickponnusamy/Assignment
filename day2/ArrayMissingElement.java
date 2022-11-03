package week1.day2;
import java.util.Arrays;
public class ArrayMissingElement {
	public static void main(String[] args) {
        int[] arr={1,2,3,4,7,6,8};
        Arrays.sort(arr);
        System.out.println("The Array Input is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int b=0;
		for(int i=0;i<arr.length;i++) {
			b+=arr[i];
		}
		int missing=sum-b;
        System.out.println("\nMissing number from Array is: "+missing);
    }
}

