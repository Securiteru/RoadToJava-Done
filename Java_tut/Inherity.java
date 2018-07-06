package Java_tut;


public class Inherity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Machinadue Machinos=new Machinadue();

		Machinos.start();
		Machinos.stop(); 
		
		Car car1=new Car(5, "carlos");
		
		car1.start();
		car1.wipeStuff();
		car1.stop();
		car1.id=5;
		car1.showInfo();
	}

}
