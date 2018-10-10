package com.pyramid;

import java.util.Scanner;

public class HalfFloydPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of row:");
		int n = sc.nextInt();
		sc.close();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(++count);
				System.out.print(' ');
			}
			System.out.println();
		}
		count = count - ((2 * n) - 1);
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(++count);
				System.out.print(' ');
			}
			count = count - ((2 * i) - 1);
			System.out.println();
		}
	}
}
