package com.pyramid;

import java.util.Scanner;

public class Pyramid26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows:");
		int n = sc.nextInt();
		sc.close();
		for (int i = n; i >=1; i--) {				
			
			for (int j = i; j <= n; j++) {				
				System.out.print(j+" ");
			}
			
			for(int blank=1;blank<=i-1;blank++) {
				System.out.print("5 ");
			}
			System.out.println();
		}

	}
}
