package com.pyramid;

import java.util.Scanner;

public class SquarePyramid1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int space=row;space>i;space--) {
				System.out.print("__");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
