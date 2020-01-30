package NestedForLoops;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int  n = sc.nextInt();
		
		int rows = 2*n-1;
					
//		int Number = 1;  to print numbers in the triangle

		for(int i = 1; i <= rows  ; i++) {
			
			if( i<=n ) {
			
				for(int j =1; j <= i; j++) {
					System.out.print("* ");
				}
			}
			else{
				for(int j=1; j<=rows-i+1; j++) {
					System.out.print("* ");
			} 			
			
			}
			System.out.println();
		}

	}
	
}
