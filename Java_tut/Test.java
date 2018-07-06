package Java_tut;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	public void run() throws IOException, ParseException{
		System.out.println("blabkla");
	}

	public static void main(String[] args){
		 Test test=new Test();
		
		 
		 try { //Multicatch per catch
				test.run();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); //or Sysout("IOExcep");
			}catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); //or Sysout("ParseExcep");
			}
		 
		 try { //Multicatch
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try { //Parentcatch
			test.run();
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		try { //Multicatch on the case of child
				test.run();
			} catch (FileNotFoundException f) {
				// TODO Auto-generated catch block
				f.printStackTrace(); //or Sysout("IOExcep");
			}catch (IOException f) {
				// TODO Auto-generated catch block
				f.printStackTrace(); //or Sysout("ParseExcep");
			}
		*/
		
			
			//runtime Excep.
			int value=7;
			
			try {
				value=value/0;
			} catch (Exception e) {
		      System.out.println(e.toString());
			}
			
			String texty=null;
			
			try {
				System.out.println(texty.length());
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			String [] texts={"bla", "bli", "blue"}; 
			try {
				System.out.println(texts[3]);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
	}
}

