package com.pyramid;

public class EShape {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print("*");
			}else if(i%3==0 || i%5==0) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			}else {
				for(int j=1;j<=n;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
