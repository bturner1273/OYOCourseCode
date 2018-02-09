package kidOYO;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class priorityQueue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = "";
		ArrayList<Integer> a = new ArrayList<Integer>();
		while (!(x.equalsIgnoreCase("p"))) {
			System.out.print("Add number to sorted list type \"p\" to print the list:");
			x = input.nextLine();
			boolean isNumber = true;
			for (int i = 0; i < x.length(); i++) {
				if (!Character.isDigit(x.charAt(i))) {
					isNumber = false;
				}
			}
			if (isNumber) {
				a.add(Integer.parseInt(x));
			} else {
			}
		}
		sortList(a.toArray());

	}

	public static void sortList(Object[] objects) {
		ArrayList<Integer> in = new ArrayList<Integer>();
		// natural ordering example of priority queue
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
		for (int i = 0; i < objects.length; i++) {
			integerPriorityQueue.add(new Integer((int) objects[i]));
		}
		for (int i = 0; i < objects.length; i++) {
			in.add(integerPriorityQueue.poll());
		}
		in.trimToSize();
		System.out.println(in);
	}
}
