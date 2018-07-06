package Java_tut;

class Person {
	// Instance variable (data or "state")
	String name;
	int age;
	String country;
	int currentSalary;
	int lifeExpect;
	// contains:
	// Data
	// Subroutine

	void speak() {
		System.out.println("Hello, my name is "+name+" and I'm "+age+" years old");
	}
	
	int calculateYearsLeftToRetirement(){
		int yearsLeft=65-age;
return yearsLeft;
	}
	
	int getAge(){
	return age;
	}
	
	int calculateEarnings(String country){
		int earn=0;
		
		earn=(lifeExpect-age)*12*currentSalary;
		
		return earn;
	}
}

class Robot{
	public void speak(String speakStuff){
		System.out.println(speakStuff);
	}
	public void move(String direction, double distance){
		System.out.println("Moving "+distance+" meters in direction "+direction);
	}
}

public class Java_app {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joey";
		person1.age = 25;
		person1.speak();

		Person person2 = new Person();
		person2.name = "Adi";
		person2.age = 25;
		person2.lifeExpect=55;
		person1.calculateYearsLeftToRetirement();
		int years=person1.calculateYearsLeftToRetirement();
		person2.country="Romania";
		person2.currentSalary=750;
		person2.calculateEarnings(person2.country);

		int age=person2.getAge();
		
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(years);
		
		
		
		Robot sam=new Robot();
		sam.speak("XXX");
		sam.move("South", 50);
		
		int earn=person2.calculateEarnings(person2.country);
		System.out.println(person2.calculateEarnings(person2.country));
		
		
	} 

}
