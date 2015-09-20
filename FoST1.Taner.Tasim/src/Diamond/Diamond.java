package Diamond;
import java.util.Scanner;
import java.util.Arrays;
public class Diamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
	
		Scanner sc = new Scanner(System.in);
		String sp = "";
		int padding = 1;
		StringBuilder sb = new StringBuilder();
		//creating a padded string
		String padded = String.format("%-" +padding+"s", sp);
		System.out.println("Please enter an odd number: ");
		//gets the input from the user 
		int numberOfStars = sc.nextInt();
		if(numberOfStars%2 ==0){
		throw new Exception("Please use odd number");
		}
		//middle is used in order to understand how many lines will be printed until the middle of the diamond
		int middle = numberOfStars/2;
		//leftSide and rightSide are used to keep track of the string builder
		int leftSide = middle;
		int rightSide = middle;
		//Filling the string builder object with padded string
		for(int i = 0; i<numberOfStars;i++){
			sb.insert(i, padded);
		}
		//Putting the first star in the middle and prints it
		sb.setCharAt(middle, '*');
		String str1 = sb.toString();	
		System.out.println(str1);
	//creating the first part of the diamond until the middle 
	for(int i = 0;i<middle; i++){
			leftSide--;
			rightSide++;
			sb.setCharAt(leftSide, '*');
			sb.setCharAt(rightSide, '*');	
		String str = sb.toString();
		System.out.println(str);

	}
	//creating the second part of the diamond
	for(int i = 1;i<middle; i++){
			rightSide = numberOfStars-i;
			leftSide = i-1;	
			sb.replace(rightSide, rightSide+1, " ");
			sb.replace(leftSide, leftSide+1, " ");	
			String str = sb.toString();
			System.out.println(str);
		
}
	//Putting the last star again in the middle and prints it
	sb.setCharAt(middle, '*');
	System.out.println(str1);	
}
}

