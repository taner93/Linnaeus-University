package CountDigits;
import java.util.Scanner;
public class CountDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number: ");
		int userInput = sc.nextInt();
		int evenNumber = 0; //keeps track of the number of even digits
		int oddNumber = 0;  //keeps track of the number of odd digits
		int zeroNumber = 0; // keeps track of the number of zeros
		int sum = 0;    	//the total sum
		String numberInString = Integer.toString(userInput); //converting the integer to string
		for(int i=0; i<numberInString.length();i++){ //going through the string
			int oneNumber = Character.digit(numberInString.charAt(i), 10); //taking each digit as a integer
			if(oneNumber%2==0 && oneNumber!=0){ //if its even number and not zero than increase its counting integer
				evenNumber++;
			}else if(oneNumber%2 != 0 && oneNumber !=0){ //if its odd number and not zero than increase its counting integer
				oddNumber++;
			}else if(oneNumber==0){ //if the digit is zero, increase the counting integer for zero
				zeroNumber++;
			}
			sum = sum+oneNumber; //calculates the sum 
		}
		System.out.println("The sum is: " +sum);
		System.out.println("Number of zeros: " +zeroNumber);
		System.out.println("Number of odd digits: " +oddNumber);
		System.out.println("Number of even digits: " +evenNumber);
	}

}
