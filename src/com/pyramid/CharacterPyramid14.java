package com.pyramid;

import java.util.Scanner;

public class CharacterPyramid14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		sc.close();
		if(ch>='a' && ch<='z') {
			ch = (char) (ch-32);
		}
		int initVal='A';
		int finalVal=ch;
		for(int i=finalVal;i>=initVal;i--) {
			for(int j=i;j<=finalVal;j++) {
				System.out.print((char)j);
			}
			
			for(int k=finalVal-1;k>=i;k--) {
				System.out.print((char)k);
			}
			System.out.println();
		}
		
		for(int i=initVal+1;i<=finalVal;i++) {
			for(int j=i;j<=finalVal;j++) {
				System.out.print((char)j);
			}
			
			for(int k=finalVal-1;k>=i;k--) {
				System.out.print((char)k);
			}
			System.out.println();
		}
				
	}

	
}
