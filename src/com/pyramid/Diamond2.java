package com.pyramid;


import java.util.Scanner;

public class Diamond2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for(int i=1;i<=row;i++){			
			if(row>i){
			    System.out.printf("%"+(row-i)+"s"," ");
			}
			for(int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=row-1;i>=1;i--){			
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

