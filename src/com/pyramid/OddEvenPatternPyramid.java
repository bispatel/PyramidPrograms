package com.pyramid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenPatternPyramid {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		int odd = 1, even = 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * i) - 1; j++) {
				if (i % 2 == 0) {
					System.out.print(even + " ");
					even += 2;
				} else {
					System.out.print(odd + " ");
					odd += 2;
				}
			}
			System.out.println();
			odd = 1;
			even = 2;
		}
	}
}
