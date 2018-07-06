package Java_tut;

public abstract class abstractTest {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void start();
	public abstract void shutdown();
	public abstract void run();
	
	public void fullAct(){
		start();
		shutdown();
		run();
	}
	
	public static void main(String[] args) {
		abstractTest1 absy=new abstractTest1();
		abstractTest2 absy2=new abstractTest2();
				
		absy.fullAct();
		absy2.fullAct();
				


	}
}


