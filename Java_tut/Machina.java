package Java_tut;

class Machine {
	private String name;
	private int code;
	

	public Machine(){
		System.out.println("Construct Running");
		
		name="Arnie";
	}
	public Machine(String name){
		this.name=name;
		System.out.println("Construct Running2");
	}
	
	public Machine(String name, int code){
		this.code=code;
				this.name=name;
				System.out.println("Construct Running3");
	}
}

public class Machina {

	
	public static void main(String[] args) {
	Machine machine1= new Machine();
	
	Machine machine2=new Machine("Secu");
	
	Machine machine3=new Machine("Secu", 3);
		
	}

}
