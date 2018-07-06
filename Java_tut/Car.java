package Java_tut;


public class Car extends Machinadue{
	
	int id;
	
	int type=id;
	
	public void wipeStuff(){
		System.out.println("Wiping shield");
	}
	
	public void start(){
		System.out.println("Car pornire");
	}

	@Override
	public void stop() {
		System.out.println("Car terminare");
	}
	
	public void showInfo(){
		System.out.println(name);
	}
	
	public Car(int id, String name){
		this.id=id;
		this.name=name;
	}
}
