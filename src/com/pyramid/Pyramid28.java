package com.pyramid;

import java.util.Scanner;

public class Pyramid28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enetr number of row:");
		int row = sc.nextInt();
		int n =(row/2)+1;
		sc.close();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(i+(i*j) + " ");
			}
			System.out.println();
		}
		
		for (int i = n+1; i <= row; i++) {
			System.out.print(i + " ");
			for (int j = 1; j <= row-i; j++) {
				System.out.print(i+(i*j) + " ");
			}
			System.out.println();
		}
	}
}
