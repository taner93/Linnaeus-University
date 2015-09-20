package CountChars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class CountChars {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		//counters for each specific requirement
		int upperCaseCounter = 0;
		int lowerCaseCounter = 0;
		
		int numberCounter = 0;
		int specialCharCount = 0;
		//giving the path of the file
		File file = new File("/home/taner/Desktop/text");
		try {
			Scanner fileScan = new Scanner(file);		
			//going through the file
			while(fileScan.hasNext()){	
				String str = fileScan.next();
					for(int i = 0; i<str.length();i++){	
						char nextOne = str.charAt(i);
	//here the logic is simple, the loop checks each character whether is one of those that we are looking for
						if(Character.isDigit(nextOne)){
							numberCounter++;
							}
							else if(Character.isUpperCase(nextOne)){
								upperCaseCounter++;
								}
								else if(Character.isLowerCase(nextOne)){
									lowerCaseCounter++;
								}
				}	
					//checking whether the file contains special character
					Pattern patternOne = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
					Matcher matcher = patternOne.matcher(str);
					boolean founded = matcher.find();
							if (founded){
							specialCharCount++;
									}
				}	
			System.out.println("Number of other characters " +specialCharCount);
			System.out.println("Number of uppercases : " + upperCaseCounter);
			System.out.println("Number of lowercases : " + lowerCaseCounter);
			System.out.println("Number of spaces: " + countSpaces(file));
			System.out.println("Number of digits: " + numberCounter);	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	//I have created separate method to count the spaces, as i had some trouble with it
	public static int countSpaces(File file) throws FileNotFoundException{
		int spaceCounter = 0;
		Scanner fileScan = new Scanner(file);
		while(fileScan.hasNext()){	
			String str = fileScan.nextLine();
			for(int i = 0; i<str.length();i++){
				char nextOne = str.charAt(i);
				if(nextOne == ' '){
					spaceCounter++;
					}
				}
			}
		return spaceCounter;
		
	}
}
