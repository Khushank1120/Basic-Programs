package NestedForLoops;
import java.util.Scanner;
public class PrintStars {

	public static void main(String[] args) {

		                                            // 		import Scanner class for taking output from user
	Scanner sc = new Scanner(System.in);            
	
		System.out.println("Enter the value for n");
	
		int n = sc.nextInt();

// 		using nested for-loops 
		
		for(int j = 1; j <= n ; j++) { 
			for(int i=1; i <=n; i++) {
				System.out.print("*  ");
	
	}
	
		System.out.println();
	
	}
	
		
}
// 	output
//	* * * *  
//	* * * *  
//	* * * *
//	* * * *

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
