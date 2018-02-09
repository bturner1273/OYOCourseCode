package kidOYO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OYOTest {
	static String[] array = {"1","2","3"};
	
	public static void main(String[] args) {
		removeElement(array,1);
		System.out.println(Arrays.toString(array));
	}


			public static void removeElement(Object[] arr, int removedIdx) {
			    System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
			}
		}

	

	
