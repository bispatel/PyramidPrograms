package com.pyramid;

import java.util.Scanner;

public class Diamond9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for (int i = row; i>=1; i--) {
			for(int j=i;j<=row;j++) {
				System.out.print(j);
			}
			for(int j=row-1;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 2; i<=row; i++) {
			for(int j=i;j<=row;j++) {
				System.out.print(j);
			}
			for(int j=row-1;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		 
	}

	
}
