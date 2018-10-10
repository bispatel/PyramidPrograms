package com.pyramid;

import java.util.Scanner;

public class Diamond8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for (int i = 1; i <= row; i++) {
			constructPyramid(row, i);
		}
		
		for (int i = row-1; i >=1; i--) {
			constructPyramid(row, i);
		}
	}

	private static void constructPyramid(int row, int i) {
		for (int j = row; j >= 1; j--) {
			String s = (i == j) ? String.valueOf(i) : "*";
			System.out.print(s+"");
		}
		for (int k = 1; k <= row; k++) {
			String s = (i == k) ? String.valueOf(i) : "*";
			System.out.print(s+"");
		}
		System.out.println();
	}
}
