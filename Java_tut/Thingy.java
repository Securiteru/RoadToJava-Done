package Java_tut;

class Thing{
	public final static int LUCKY_NUMBER=7;
	public String name;
	public static String descrip;
	
	public static int count=0;
	
	public int id=0;
	
	public Thing (){
		id=count;
			count++;
	}
	public void showInfo(){
		System.out.println("Hello, my name is "+name+" and I am "+id+" of "+count+" total things.");
	}

	
}
public class Thingy {
	public static void main(String[] args) {
		Thing.descrip="I am a thing";
		
		Thing thing1=new Thing();
		Thing thing2=new Thing();
		
		thing1.name="Bob";
		thing2.name="Sue";
				
		System.out.println(Thing.descrip);
		
		thing1.showInfo();
		thing2.showInfo();
		
		System.out.println("There is a total of "+Thing.count+" things."+" and our lucky number is "+Thing.LUCKY_NUMBER+" FOREVERRR");
 
	}

}
