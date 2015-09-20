package LargestK;
import java.util.Scanner;
public class LargestK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//NOTICE! I have different approaches for even and odd numbers
		Scanner sc = new Scanner(System.in);
		int newNumber=0;
		final int evenNumber = 2;
		int calculation = 0; //used to calculate the last even number when the user input is odd
		int newInt = 0;      // also used in the calculation for the last number if the input is odd
		System.out.print("Please enter a number: ");
		
		int usersNumber = sc.nextInt();
		if(usersNumber%evenNumber == 0){   //checks whether the number is even or odd
			while(calculation<usersNumber){ //loop to reach the maximum possible number but must be less than the users input
			newNumber=newNumber + evenNumber; //keeps track of the next even number
			calculation=calculation+newNumber; //stores the sum of the even numbers
			if(calculation>=usersNumber){ //if the sum is bigger than the users input than print the last even number
				System.out.println(newNumber);
			}
			}
		}else{
		while(calculation<usersNumber){
			newNumber = newNumber + evenNumber; //keeps track of the currently even number	
			calculation = calculation + newNumber; //keeps track of the sum			
			if(calculation>=usersNumber){ 
				newInt = calculation-(newNumber+evenNumber);
				System.out.println(newInt);
			}
		}
		}
		}
	
		
	}


