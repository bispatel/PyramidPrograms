package com.pyramid;

import java.util.Scanner;

public class Pyramid29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int maxRow = sc.nextInt();
		sc.close();
		int init=1;
		int arrSize = maxRow*(maxRow+1);
		int array[] = new int[arrSize];
		
		for(int i=0;i<arrSize;i++) {
			array[i]=init++;
		}

		System.out.println("\nPyramid:");
		int frontCount=0;
		int backCount=arrSize;
		for(int i=maxRow;i>=1;i--) {
			for(int space=maxRow;space>i;space--) {
				System.out.print("--");
			}
			for(int j=0;j<i;j++) {				
				System.out.print(array[j+frontCount]+"*");
			}
			for(int k=i;k>=1;k--) {
				if(k==1) {
					System.out.print(array[backCount-k]);	
				}else {
					System.out.print(array[backCount-k]+"*");
				}
				
			}
			frontCount+=i;
			backCount-=i;
			System.out.println();
		}
		
	}
}
