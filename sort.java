package b1;

import java.util.Scanner;
public class sort {
	static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
	
	
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = keyboard.nextInt();
		}
		bubbleSort(arr, n);
		System.out.print("mang la: ");
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		double avg =(double) sum/n;
		System.out.println("Sum=" + sum);
		System.out.print("AVG=" + avg);
	}
}

