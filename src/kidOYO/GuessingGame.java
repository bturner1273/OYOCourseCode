package kidOYO;
import java.util.Scanner;

public class GuessingGame{
	static int guessCount = 0;
	static int rangel, rangeh;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please specify the range that you will pick a number in"
				+ "\nusing format \"number\",\"space\",\"number\" (i.e. 1 100):");
		int x = input.nextInt();
		int y = input.nextInt();
		if(x < y){
			rangel = x;
			rangeh = y - 1;
			guessNumber(x,y);
		}else{
			rangel = y;
			rangeh = x - 1;
			guessNumber(y,x);
		}	
	}
	
	public static void guessNumber(int low, int high){
		Scanner input = new Scanner(System.in);
		boolean correct = false;
		String answer = "";
		while(!correct){
			//System.out.println("low = " + low + " high = " + high);
			System.out.println("is your number " + ((high+low)/2) + "?");
			guessCount++;
			answer = input.nextLine();
			answer.toLowerCase();
			if(answer.equals("yes")){
				System.out.println("See, I am a magician... I figured you out in " + guessCount + " guesses");
				correct = true;
				System.exit(0);
			}else if(answer.equalsIgnoreCase("no")){
				if((high+low)/2 == rangeh){
					System.out.println("Answer == " + (rangeh + 1) + ", See I am a magician...I figured you out in " + guessCount + " guesses");
					System.exit(0);
				}
				if((high+low)/2 == rangel){
					System.out.println("Answer == " + rangel + ", See I am a magician...I figured you out in " + guessCount + " guesses");
					System.exit(0);
				}
				System.out.print("is your guess lower or higher? \ntype \"l\" for lower and \"h\" for higher:");
				answer = input.nextLine().toLowerCase();
				if(answer.equals("h")){
					guessNumber(((high+low)/2), high);
				}
				if(answer.equals("l")){
					guessNumber(low, ((high-low)/2 + low));
				}
				}
			}
			
		}
	}

