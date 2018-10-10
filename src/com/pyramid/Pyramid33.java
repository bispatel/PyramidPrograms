package com.pyramid;

import java.util.Scanner;

public class Pyramid33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int maxRow = sc.nextInt();
		sc.close();
		
		for(int i=0;i<=maxRow;i++) {
			for(int j=i;j>=0;j--) {				
				System.out.print(j);
			}
			for(int k=1;k<=i;k++) {				
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
}
