package com.pyramid;

import java.util.Scanner;

public class Rhombus1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number of row:");
		int row = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=row;i++) {
			if(row>i) {
				System.out.printf("%"+(row-i)+"s"," ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		for(int i=row-1;i>=1;i--) {
			if(row>i) {
				System.out.printf("%"+(row-i)+"s"," ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
