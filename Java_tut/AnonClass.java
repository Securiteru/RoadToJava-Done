package Java_tut;

interface Planty{
	public void grow();
}

public class AnonClass {

	public void start(){
		System.out.println("Starting Anon");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnonClass machine=new AnonClass(){
			@Override public void start(){
				System.out.println("cam snapping");
			}
		
		};
		machine.start();
		
		Planty plant=new Planty(){

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("planty growing");
				
			}
			
		};
		plant.grow();
	}

}
