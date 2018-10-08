package com.pyramid;

import java.util.Scanner;

public class Pyramid24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows:");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {			
			for (int j = i; j <= n; j++) {				
				System.out.print(j+" ");
			}
			for (int j = n-1; j >= i; j--) {				
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
