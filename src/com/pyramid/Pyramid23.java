package com.pyramid;

import java.util.Scanner;

public class Pyramid23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows:");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for(int blank=1;blank<=n-i;blank++) {
				System.out.print("1 ");
			}
			for (int j = 1; j <= i; j++) {				
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
}
