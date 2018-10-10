package com.pyramid;

public class Pyramid17 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int blank = 1; blank <= i - 1; blank++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int blank = 1; blank <= i-1; blank++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
