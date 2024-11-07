package b1;

import java.awt.FocusTraversalPolicy;
import java.io.InputStream;
import java.util.Scanner;

public class hoanvi {
	public static int n;
	public static int x[] = new int [100];
	public static int used[];
	public static void Try(int i) {
		for(int j=1;j<=n;j++) {
			if(used[j]==0) {
				x[i] = j;
				used[j] = 1;
				if(i==n) {
					for(int a= 1;a<=n;a++) {
						System.out.print(x[a] + " ");
					}
					System.out.println("");
				}
				else Try(i+1);
				used[j] = 0;
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		used = new int [n+1];
		Try(1);
		sc.close();
	}
}
