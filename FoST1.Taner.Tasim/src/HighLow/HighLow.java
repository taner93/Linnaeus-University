package HighLow;

import java.util.Random;
import java.util.Scanner;
public class HighLow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random randomNumberGenerator = new Random(); //creating the random number generator object
		Scanner sc = new Scanner(System.in);		 //creating the scanner for the input
		int tries = 20;								
		int randomNumber = randomNumberGenerator.nextInt(101); //generating random number
		//	System.out.println("The random number is: " +randomNumber); //used only for testing to see the random number
		for(int i = 0; i<tries; i++){ //the main loop which ends when the correct number guessed
		System.out.println("Guess the number: ");
		
			int userAnswer = sc.nextInt();
			if(userAnswer == randomNumber){
			System.out.println("Great! Thats the number, correct after: " +i+ " times");
			tries=0;
			}else{
				tries = tries - 1; //decreases the number of tries
				
				if(randomNumber>userAnswer){ //checks whether the guessed number is bigger or smaller than the random one
					System.out.println("The number is bigger than your answer");
				}else{
					System.out.println("The number is smaller than your answer");
				}
			}
		}
		
	}

}
