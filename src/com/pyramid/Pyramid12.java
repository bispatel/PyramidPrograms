package com.pyramid;

public class Pyramid12 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
			for(int j=1;j<=i-1;j++) {
				System.out.print((i+(j*5))+" ");
			}
		 System.out.println();
		}		
	}
}
