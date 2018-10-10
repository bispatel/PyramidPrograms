package com.pyramid;

import java.util.Scanner;

public class Pyramid31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int maxRow = sc.nextInt();
		sc.close();
		
		

		System.out.println("\nPyramid:");
		for(int i=1;i<=maxRow;i++) {
			for(int space=maxRow;space>i;space--) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i)-1;j++) {				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
