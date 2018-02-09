package kidOYO;

import java.util.Scanner;
public class ReverseAString {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to reverse: ");
		String a = input.nextLine();
		char[] b = a.toCharArray();
		reverse(b);
		print(b);
			
	}
	public static void print(char[] b){
		for(int i = 0; i < b.length; i++){
			if(i == b.length-1){
				System.out.print(b[i]);
			}else
			System.out.print(b[i] + ", ");
		}
	}
	public static void reverse(char[] b){
		char temp;
		for(int i = 0; i < b.length/2; i++){
			int j = b.length - (i+1);
			temp = b[i];
			b[i] = b[j];
			b[j] = temp;	
		}
	}
}
