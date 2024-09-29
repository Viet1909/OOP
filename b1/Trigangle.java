package b1;

import java.util.Scanner;

public class Trigangle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int  i = keyboard.nextInt();
		for(int j = 1; j<=i;j++) {
			for(int k = j;k<i;k++) {
				System.out.print(" ");
			}
			for(int l = 0; l<(2*j-1);l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
