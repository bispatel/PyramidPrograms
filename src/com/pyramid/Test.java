package com.pyramid;


public class Test {

	private static int sum_n(int a) {
		return (a > 1) ? a + sum_n(a - 1) : a;
	}

	public static void main(String[] args) {
		int n = 6;
		int max_num = 2 * sum_n(n);
		System.out.println(max_num);
		int a = 1;
		int b = 0;
		for (int i = 0; i < n; i++) {
			for (int l = 0; l < i; l++) {
				System.out.print("--");
			}
			for (int j = 0; j < (n - i); j++) {
				System.out.print(a+"*");
				a++;
			}
			b = a - 2;
			for (int j = 1; j < (n - i); j++) {
				System.out.print(max_num - b+"*");
				b--;
			}
			System.out.print(max_num - b);
			System.out.println();
		}
	}
}