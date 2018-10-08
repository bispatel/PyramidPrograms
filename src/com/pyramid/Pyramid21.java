package com.pyramid;

import java.util.Scanner;

public class Pyramid21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows:");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {				
				System.out.print(j%2+" ");
			}
			System.out.println();
		}

	}
}
