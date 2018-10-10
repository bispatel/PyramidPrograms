package com.pyramid;

import java.util.Scanner;

public class HalfFloydPyramid2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for (int i = row; i >= 1; i--) {
			for (int j = row; j >= i; j--) {
				System.out.print(j);
				System.out.print(' ');
			}
			
			for (int k = i+1; k <= row; k++) {
				System.out.print(k);
				System.out.print(' ');
			}
			System.out.println();
		}
		
		for (int i = 2; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print(j);
				System.out.print(' ');
			}
			
			for (int k = i+1; k <= row; k++) {
				System.out.print(k);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
