package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		 
		int temp = n;
		
		int sum = 0;
		 
		while( temp > 0) {
		
			int lastDigit = temp % 10;
			temp /= 10;			
		    sum += lastDigit;

		    //	   how the code is working 
		   
		    System.out.println(lastDigit + " " + temp + " " + sum + " " );
		
		}

		System.out.println("The sum of the digits " + n + " is " + sum);
		
	}

}
