package com.pyramid;

public class Pyramid5 {

	public static void main(String[] args) {

		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
		 System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
		 System.out.println();
		}
	}
}
