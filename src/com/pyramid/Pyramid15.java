package com.pyramid;

public class Pyramid15 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int blank=1;blank<=n-i;blank++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
		 System.out.println();
		}		
	}
}
