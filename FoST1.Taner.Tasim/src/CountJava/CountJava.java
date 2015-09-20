package CountJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
        final String path ="/home/taner/Desktop/Linneaus university/";
        listEverything(path);
	
	}
    public static void listEverything(String directoryName) throws FileNotFoundException{
    	int counter=0; //used to store the number of lines in a java file
        File directory = new File(directoryName);
        File[] fileList = directory.listFiles();
        //used for each loop to check everything inside the given path
        for (File file : fileList){
        	String filename = file.getName();
        //checking here whether the file has an .java extension or not
        //if it has extension .java, go through the file and count the number of lines	
            if(filename.endsWith(".java")){
                System.out.println("Java file ! ");
                Scanner fileScan = new Scanner(file);
    			while(fileScan.hasNext()){
    				counter++;
    				String str = fileScan.nextLine();
    			}
    			System.out.println("File: " +filename+ " has " +counter+ " lines");
            }
            if (file.isFile()){
            	file.getAbsolutePath();
            } else if (file.isDirectory()){
                listEverything(file.getAbsolutePath());

            }

        }

    }
	
}