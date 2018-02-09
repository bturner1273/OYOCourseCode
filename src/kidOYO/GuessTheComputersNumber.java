package kidOYO;

import java.util.Scanner;


public class GuessTheComputersNumber {
	static int comNum;
	static Scanner input;
	static boolean done = false;
	public static void main(String[] args){
		input = new Scanner(System.in);
		getRandomComNum();
		getUserGuess();
	}
	public static void getUserGuess(){
		while(!done){
			System.out.println("Please enter an integer guess for the number you think the computer picked: ");
			int guess = input.nextInt();
			if(guess == comNum){
				done = true;
				System.out.println("Great job! You guessed my number!");
				System.exit(0);
				}else{
					if(guess > comNum){
					System.out.println("Guess lower!");
					}else{
					System.out.println("Guess higher!");
					}
			}
		}
	}
	public static void getRandomComNum(){
		System.out.print("Please enter the lower bound of the range you would like the computer to choose a number in:");
		int lowerBound = input.nextInt();
		System.out.print("Please enter the upper bound of the range you would like the computer to choose a number in:");
		int upperBound = input.nextInt();
		
		if(upperBound < lowerBound){
			comNum = (int)(upperBound + Math.random()*lowerBound);
		}else{
			comNum = (int)(lowerBound + Math.random()*upperBound);
		}
	}
}
