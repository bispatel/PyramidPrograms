package com.pyramid;

import java.util.Scanner;

public class CharacterPyramid11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		sc.close();
		if(ch>='a' && ch<='z') {
			ch = (char) (ch-32);
		}
		
		for(char c='A';c<=ch;c++) {			
			for(char c1='A';c1<=c;c1++) {
				System.out.print(c);
				System.out.print((char)(c+32));
				System.out.print(" ");
			}
			
			System.out.println();	
		}
		
		
	}

	
}
