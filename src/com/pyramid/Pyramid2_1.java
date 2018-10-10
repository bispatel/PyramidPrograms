package com.pyramid;

import java.util.Scanner;

public class Pyramid2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			if(n>i) {
				System.out.printf("%"+(n-i)+"s"," ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print(i);
			}
		 System.out.println();
		}
	}
}
