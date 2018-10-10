package com.pyramid;


import java.util.Scanner;

public class Diamond6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for(int i=1;i<=row;i++){			
			for(int j=1;j<=row;j++){
				if(j==i) {
					System.out.print("*");
				}else {
					System.out.print("0");	
				}				
			}
			System.out.println();
		}
	}
}

