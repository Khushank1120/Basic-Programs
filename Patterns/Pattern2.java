package NestedForLoops;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);     // 	using scanner class and taking input
		
		System.out.println("Entre value for n");
		int n = sc.nextInt();

		// 		using nested for-loop
		
		for(int i=1;i<=n;i++) { 
		
			for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		
			System.out.println();

		 } 
		
	}

}

// output
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
