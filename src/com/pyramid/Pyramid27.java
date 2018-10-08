package com.pyramid;

public class Pyramid27 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			int count = i;
			for (int j = 1; j <= i - 1; j++) {
				count = count + n - j;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
}
