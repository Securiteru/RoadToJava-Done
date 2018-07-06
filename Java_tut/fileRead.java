package Java_tut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		Boolean isAdmin=false;
		// TODO Auto-generated method stub
		
		String filepathAbs="/home/adrian/Documents/JavaTest.txt";
		
		String filepathREL="JavaTest.txt";
		
		File textFile= new File(filepathREL);
		
		try {	
			
			Scanner in;
			in = new Scanner(textFile);
			
			
			int count=0;
			
			while(in.hasNextLine()){
				String line=in.nextLine();
				System.out.println(count+" : "+ line);
				count++;
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			if(isAdmin){
				e.printStackTrace();
			}
			else{
				System.out.println("File not found: " + textFile.toString());
			}
		}
		
		
		
	}

}
