package com.pyramid;


import java.util.Scanner;

public class Diamond3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row:");
		int row = sc.nextInt();
		sc.close();
		for(int i=row;i>=1;i--){			
			constructPyramid(row, i);
		}
		
		for(int i=2;i<=row;i++){			
			constructPyramid(row, i);
		}
	}

	private static void constructPyramid(int row, int i) {
		if(row>i){
		    System.out.printf("%"+(row-i)+"s"," ");
		}
		for(int j=1;j<=(2*i)-1;j++){
			System.out.print("*");
		}
		System.out.println();
	}
}

