package com.pyramid;

import java.util.Scanner;

public class SquarePyramid3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for (int i = 1; i <= row; i++) {
			constructPyramid(row, i);	
		}
		for (int i = row-1; i >= 1; i--) {
			constructPyramid(row, i);	
		}
	}

	private static void constructPyramid(int row, int i) {
		for (int j = 1; j <=row; j++) {
			if(j<=i) {
				System.out.print(j);
			}else {
				System.out.print(i);
			}            	   
		}
		
		for (int j = row-1; j >=1; j--) {
			if(j<=i) {
				System.out.print(j);
			}else {
				System.out.print(i);
			}            	   
		}
System.out.println();
	}
}
