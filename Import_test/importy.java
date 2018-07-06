package Import_test;

import Java_tut.*;

public class importy {

	public static void main(String[] args) {
		MachineMode Adi = new MachineMode();
		Adi.start();

		Hooman hoomy = new Hooman("Adi");
		hoomy.greet();

		info info1 = new MachineMode();
		info1.showInfo();

		info info2 = hoomy;
		info2.showInfo();
		
		Orks ork1=new Orks();
		System.out.println(ork1.name);
	//	System.out.println(ork1.type);
	//	System.out.println(ork1.mark);
	}
	

}
