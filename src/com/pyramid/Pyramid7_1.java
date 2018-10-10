package com.pyramid;

import java.util.Scanner;

public class Pyramid7_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int row =sc.nextInt();
		sc.close();
		System.out.println();
		for(int i=row;i>=1;i--) {
			if(row>i){
			    System.out.printf("%"+(row-i)+"s"," ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
		 System.out.println();
		}
		
	}
}
