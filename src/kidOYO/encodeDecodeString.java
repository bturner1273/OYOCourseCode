package kidOYO;
import java.util.Scanner;
public class encodeDecodeString {
	static String toEncode;
	static int encodeOffset = 9;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String you would like to encode: ");
		toEncode = input.nextLine();
			encodeOffset %= 26;
			char[] encoded = toEncode.toCharArray();
			System.out.println("\nEncoded String: ");
			encode(encoded);
			printCharArray(encoded);
			System.out.println("\nDecoded String: ");
			decode(encoded);
			printCharArray(encoded);
		}
	public static void printCharArray(char[] encoded){
		for(int i = 0; i < encoded.length; i++){
			System.out.print(encoded[i]);
		}
		System.out.println();
	}
	public static void decode(char[] encoded){
		for(int i = 0; i < encoded.length; i++){
			encoded[i] -= encodeOffset;
			if(encoded[i] < 96){
				encoded[i] += 26;
			}
			
	}
	}
	public static void encode(char[] encoded){
		for(int i = 0; i < encoded.length; i++){
			encoded[i] += encodeOffset;
			while(encoded[i] > 122){
				encoded[i] -= 26;
			}
	}
	}
}

