package com.pyramid;

import java.util.Scanner;

public class Pyramid30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for(int i=1;i<=row;i++){
			/*for(int space=1;space<=row-i;space++){
				System.out.print(" ");
			}*/
			if(row>i){
			    System.out.printf("%"+(row-i)+"s"," ");
			}
			for(int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
