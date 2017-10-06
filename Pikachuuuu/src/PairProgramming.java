//Harrison Noland
//2nd period
//pair collab
import java.util.Scanner;

public class PairProgramming {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		int sum = 0;
		int numInputs;
		String even = " ";
		int largestEven = -2147483648; 
		boolean done = false;
		System.out.print("Enter a integer:");
		int num = userInput.nextInt();
		int min = num;
		int max = num;
		System.out.print("Are you done yet?");
		String one = userInput.next();
		if(one.equalsIgnoreCase("yes")) {
			done = true;
		}
		while(!done) {
			System.out.println("How many numbers do you have?");
			System.out.print("Enter a string of Numbers:");
			num = userInput.nextInt();
			if(num < min) {
				min = num;
		}
			else if(num > max) {
				max = num;
			}
			if(num % 2 == 0) {
				sum += num;
				if(num > largestEven) {
					 largestEven = num;
				}
			}
		}
		System.out.print("Done yet?");
		one = userInput.next();
		if(one.equalsIgnoreCase("yes")) {
			done = true;
		}
		System.out.println("The smallest number is " +min+ ".");
		System.out.println("The largest number is "+max+ ".");
		System.out.println("The sum of all even numbers entered is "+sum+ " and the largest even number is "+largestEven+ ".");
		}
		
		
	}

