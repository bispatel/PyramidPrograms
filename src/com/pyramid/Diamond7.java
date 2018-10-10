package com.pyramid;

import java.util.Scanner;

public class Diamond7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		int totalRow=(2*row)-1;
		sc.close();
		int frontCount=row;
		int backCount=row;
		for (int i = row; i >= 1; i--) {			
			for (int j = 1; j <= totalRow; j++) {				
				if(i==j || frontCount==j || backCount==j) {
					System.out.print("*");
				}else {
					System.out.print("#");		
				}			
			}
			frontCount+=1;
			backCount-=1;
			System.out.println();
		}
	}
}
