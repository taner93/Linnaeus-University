package Backwards;
import java.util.Scanner;
public class Backwards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating a String builder in order to use the reverse method
		StringBuilder sb = new StringBuilder(); 
		//Scanner used to get the input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter text: ");
		String userInput = sc.nextLine();
		//Appending the input from the user to the string builder
		sb.append(userInput); 
		//Reversing the appended value
		sb.reverse();
		//Converting the string builder into string
		String reversedOutput = sb.toString();
		System.out.print(reversedOutput);
		

	}

}
