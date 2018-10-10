package com.pyramid;

import java.util.Scanner;

public class HalfRhombus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int row = sc.nextInt();
		sc.close();
		for (int i = 0; i < row; i++) {
			constructPyramid(row, i);
		}

		for (int i = row - 2; i >= 0; i--) {
			constructPyramid(row, i);
		}
	}

	private static void constructPyramid(int row, int i) {
		for (int j = 0; j < (2 * i) + 1; j++) {
			System.out.print(row - i + j);
		}
		System.out.println();
	}
}
