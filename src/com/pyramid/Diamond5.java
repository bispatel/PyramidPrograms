package com.pyramid;


import java.util.Scanner;

public class Diamond5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for(int i=1;i<=row;i++){			
			for(int j=1;j<=i-1;j++){
				System.out.print(i+"*");
			}
			System.out.print(i);
			System.out.println();
		}
		
		for(int i=row-1;i>=1;i--){			
			for(int j=1;j<=i-1;j++){
				System.out.print(i+"*");
			}
			System.out.print(i);
			System.out.println();
		}
		
		
	}
}

