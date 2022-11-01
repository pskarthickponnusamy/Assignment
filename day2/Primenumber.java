package week1.day2;

public class Primenumber {
public static void main(String[] args)
	{
			int n=4;
			boolean flag=false;
			int half=n/2;
			if (n==0||n==1) {
				flag=true;
			} else {
				for (int i = 2; i <= half; i++) {
					if (n%i==0) {
						flag=true;
						break;
						
					}
				}
			}
			if (flag==true) {
				System.out.println(n+" is not a PRIME NUMBER");
			} else {
				System.out.println(n+" is a PRIME NUMBER");
			}
		}
	}



			


	



		// Declare an int Input and assign a value 13

		

		// Declare a boolean variable flag as false

		

		// Iterate from 2 to half of the input

		

			// Divide the input with each for loop variable and check the remainder

			

			// Set the flag as true when there is no remainder

				
			// break the iterator


		// Check the flag (Provide a condition)

		

			// Print 'Prime' when the condition matches

			

			// Print 'Not a Prime' when the condition doesn't match 

   



