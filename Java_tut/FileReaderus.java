package Java_tut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderus {

	
	public static void main(String[] args) {
		
		File filey=new File("WannabeDB.txt");
		
		BufferedReader br=null;
		
		try {
			FileReader fr=new FileReader(filey);
			 br=new BufferedReader(fr);
			
			String liney;
			
			while ( (liney=br.readLine())!=null ){
				System.out.println(liney);
			}
			
			
			} catch (FileNotFoundException e) {
				System.out.println("File not found: " +filey.toString());
			} catch (IOException e){
				System.out.println("Can't read: "+filey.toString());
			} finally{
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NullPointerException ex){
					//File wasn't opened.
					System.out.println("Unable to close file: "+filey.toString());
				}
			}
	
	}
}
