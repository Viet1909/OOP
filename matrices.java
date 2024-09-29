package b1;
import java.util.Scanner;

public class matrices {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int[][] arr1 = new int [a][b];
		int[][] arr2 = new int [a][b];
		int[][] sum = new int [a][b];
		System.out.println("Nhap mang 1:");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr1[i][j] = keyboard.nextInt();
			}
		}
		System.out.println("Nhap mang 2:");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr2[i][j] = keyboard.nextInt();
			}
		}
		for(int i = 0;i<a;i++) {
			for(int j = 0;j<b;j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];			
			}
		}
		System.out.println("Ket qua khi cong la:");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}