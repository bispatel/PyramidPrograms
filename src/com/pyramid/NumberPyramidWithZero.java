package com.pyramid;

import java.util.Scanner;

public class NumberPyramidWithZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int row = sc.nextInt();
		sc.close();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <=i; j++) {
				if(i==j) {
					System.out.print(j);	
				}else {
					System.out.print("0");
				}				
			}
			System.out.println();
		}

		
	}

	 
}
