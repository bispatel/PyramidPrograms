package com.pyramid;

import java.util.Scanner;

public class Pyramid32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int maxRow = sc.nextInt();
		sc.close();
		
		for(int i=maxRow;i>=1;i--) {
			for(int space=maxRow;space>i;space--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {				
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {				
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
}
