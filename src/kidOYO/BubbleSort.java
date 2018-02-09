package kidOYO;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args){
		int[] a = {20,12,17,4,32,46,5,51,23,4};
		System.out.println("Unsorted List: ");
		System.out.println(Arrays.toString(a));
		System.out.println("\nSorting...");
		a = bubbleSort(a);
		System.out.println("\nSorted list:");
		printList(a);
}
	public static int[] bubbleSort(int[] a){
		int temp;
		for(int i = 0; i < a.length; i++){
			for(int j = i; j < a.length; j++){
				if(a[j] < a[i]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				//printList(a);
			}
			printList(a);
		}
		return a;
	}
	public static void printList(int[] a) {
		for(int i = 0; i < a.length; i++){
			if(i == a.length-1){
				System.out.println(a[i]);
			}else 
			System.out.print(a[i] + ", ");
		}
	}
}
