package Java_tut;
class Machine5{
	public void start(){
		System.out.println("Machine Started");
	}
	
}

class Camera extends Machine5{
	public void start(){
		System.out.println("Camera Started");
	}
	
	public void snap(){
		System.out.println("Snapped.");
	}
}


public class upcasting_Downcasting {

	public static void main(String[] args) {
		Machine5 Machine1=new Machine5();
		Camera Camera1=new Camera();
		
		Machine1.start();
		Camera1.start();
		Camera1.snap();
		
	//Upcasting
		
		Machine5 Machine2=Camera1;
		Machine2.start();
		//Doesn't work, still a Machine.
	//	Machine2.snap();
		
	//Downcasting
		
		
		
	}

}
