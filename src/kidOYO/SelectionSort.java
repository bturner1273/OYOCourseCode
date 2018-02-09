package kidOYO;

import java.util.Arrays;

public class SelectionSort {
	 
	public static void main(String[] args){
		int[] a = {20,12,17,4,32,46,5,51,23,4};
		System.out.println("Unsorted List:");
		System.out.println(Arrays.toString(a));
		System.out.println("\nSorting...");
		selectionSort(a);
		System.out.println("\nSorted List:");
		printList(a);
	}
	
	public static void selectionSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++){
        	int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            swap(arr, min_idx, i);
            System.out.println(Arrays.toString(arr));
        }
	}
	public static void swap(int[] arr, int a, int b){
		  int temp = arr[a];
          arr[a] = arr[b];
          arr[b] = temp;
	}
	public static void printList(int[] a){
		for(int i = 0; i < a.length; i++){
			if(i == a.length-1){
				System.out.println(a[i]);
			}else 
			System.out.print(a[i] + ", ");
		}
	}
}
