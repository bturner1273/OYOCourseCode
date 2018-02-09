package kidOYO;
import java.util.ArrayList;
import java.util.Scanner;


public class HangMan {
	static boolean done = false;
	static int count = 0;
	static String word = "";
	static ArrayList<String> guesses = new ArrayList<String>(6);
	public static void main(String[] args){
		getExecutionerInput();
		while(!done){
		print();
		printWord();
		getUserGuess();
		}
	}
	public static void getUserGuess(){
		System.out.print("\n\n\t\t\t\t\t\tGuess a letter:");
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		while(!Character.isLetter(x.charAt(0)) || x.length() > 1){
			System.out.print("\t\t\t\t\tPlease enter a single letter: ");
			x = input.nextLine();
		}
		guesses.add(x);
		if(!(word.contains(x))){
			count++;
		}
		}
	
	public static void printWord(){
		int count1 = 0;
		boolean yes = false;
		System.out.print("\t\t\t\t\t\t      ");
		for(int i = 0; i < word.length(); i++){
			for(int j = 0; j < guesses.size(); j++){
				if(guesses.get(j).toCharArray()[0] == word.charAt(i)){
					count1++;
					System.out.print(word.charAt(i) + " ");
					yes = true;
				}
			}
			if(!yes){
				System.out.print("_ ");
			}
			yes = false;
			}
		if(count1 == word.length()){
			done = true;
			System.out.println("\n\t\t\t\t\t\t\tYou Win!!!!");
			System.exit(0);
		}
		}
	public static void getExecutionerInput(){
		Scanner input = new Scanner(System.in);
		System.out.println("NOBODY LOOK");
		System.out.print("Executioner enter your word here:");
		String x = input.nextLine();
		x = x.toLowerCase();
		while(!isWord(x)){
			System.out.print("Executioner please enter a valid word:");
			x = input.nextLine();
		}
		word = x;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");	
	}
	public static boolean isWord(String x){
		for(int i = 0; i < x.length(); i++){
			if(!Character.isAlphabetic(x.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static void print(){
		if(count == 0){
		System.out.println("\t\t\t\t\t\t _______________");
		System.out.println("\t\t\t\t\t\t|\t\t|");
		System.out.println("\t\t\t\t\t\t|\t\t|");
		System.out.println("\t\t\t\t\t\t\t\t|");
		System.out.println("\t\t\t\t\t\t\t\t|");
		System.out.println("\t\t\t\t\t\t\t\t|");
		System.out.println("\t\t\t\t\t\t\t\t|");
		System.out.println("\t\t\t\t\t\t\t\t|");
		System.out.println("\t\t\t\t\t\t\t\t|");
		System.out.println("\t\t\t\t\t\t\t\t|");
		System.out.println("\t\t\t\t\t\t-------------------------------");
		}
		if(count == 1){
			System.out.println("\t\t\t\t\t\t _______________");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\tO\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t-------------------------------");
		}
		if(count == 2){
			System.out.println("\t\t\t\t\t\t _______________");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\tO\t\t|");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t-------------------------------");
		}
		if(count == 3){
				System.out.println("\t\t\t\t\t\t _______________");
				System.out.println("\t\t\t\t\t\t|\t\t|");
				System.out.println("\t\t\t\t\t\t|\t\t|");
				System.out.println("\t\t\t\t\t\tO\t\t|");
				System.out.println("\t\t\t\t\t       -|\t\t|");
				System.out.println("\t\t\t\t\t\t\t\t|");
				System.out.println("\t\t\t\t\t\t\t\t|");
				System.out.println("\t\t\t\t\t\t\t\t|");
				System.out.println("\t\t\t\t\t\t\t\t|");
				System.out.println("\t\t\t\t\t\t-------------------------------");
		}
		if(count == 4){
			System.out.println("\t\t\t\t\t\t _______________");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\tO\t\t|");
			System.out.println("\t\t\t\t\t       -|-\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t-------------------------------");
	}
		if(count == 5){
			System.out.println("\t\t\t\t\t\t _______________");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\tO\t\t|");
			System.out.println("\t\t\t\t\t       -|-\t\t|");
			System.out.println("\t\t\t\t\t       /\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t-------------------------------");
	}
			if(count == 6){
			System.out.println("\t\t\t\t\t\t _______________");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\t|\t\t|");
			System.out.println("\t\t\t\t\t\tO\t\t|");
			System.out.println("\t\t\t\t\t       -|-\t\t|");
			System.out.println("\t\t\t\t\t       / \\\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\t\t\t|");
			System.out.println("\t\t\t\t\t\tyou dead\t|");
			System.out.println("\t\t\t\t\t\t-------------------------------");
			System.exit(0);
	}
	}
}
