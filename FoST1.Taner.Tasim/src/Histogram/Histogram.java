package Histogram;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Histogram {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//these integers will count the matches within the corresponding ranges
		int range1=0,range2=0,range3=0,range4=0,range5=0,range6=0,range7=0,range8=0,range9=0,range10=0,range11 =0;
		File file = new File("/home/taner/Desktop/test");
		Scanner scanner = new Scanner(file);
		//go through the whole file and check if a number is within given range
		//if so, then increase the corresponding counter
		while(scanner.hasNextInt())
		{
		  
			int nextOne = scanner.nextInt();
		
			if(nextOne>= 0 && nextOne<= 10){
				range1++;
			}else if(nextOne>=11 && nextOne<=20){
				range2++;
			}else if(nextOne>=21 && nextOne<=30){
				range3++;
			}else if(nextOne>=31 && nextOne<=40){
				range4++;
			}else if(nextOne>=41 && nextOne<=50){
				range5++;
			}else if(nextOne>=51 && nextOne<=60){
				range6++;
			}else if(nextOne>=61 && nextOne<=70){
				range7++;
			}else if(nextOne>=71 && nextOne<=80){
				range8++;
			}else if(nextOne>=81 && nextOne<=90){
				range9++;
			}else if(nextOne>=91 && nextOne<=100){
				range10++;
			}else if(nextOne>=101 && nextOne<=200){
				range11++;
			}
		}
		System.out.println("Histogram");
		System.out.println("1 -  10 " +printStar(range1));
		System.out.println("11 - 20 " +printStar(range2));
		System.out.println("21 - 30 " +printStar(range3));
		System.out.println("31 - 40 " +printStar(range4));
		System.out.println("41 - 50 " +printStar(range5));
		System.out.println("51 - 60 " +printStar(range6));
		System.out.println("61 - 70 " +printStar(range7));
		System.out.println("71 - 80 " +printStar(range8));
		System.out.println("81 - 90 " +printStar(range9));
		System.out.println("91 - 100 " +printStar(range10));
		System.out.println("101 - 200 " +printStar(range11));
		
	}
	//method used to print the stars, it creates an string builder and then
	//inserts stars to itself, the number of stars are given as parameter to the method
	public static String printStar(int n){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n;i++){
			sb.insert(i, "*");
		}
		String str = sb.toString();
			return str;
	    
	}
}