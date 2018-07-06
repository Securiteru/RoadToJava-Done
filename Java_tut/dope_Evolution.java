package Java_tut;

class Animal {
	public void identify() {
		System.out.println("I am an animal.");
	}
	public static void pet(Animal a){
		System.out.println("I'm petting a sub-Animal species"+a);
	}
}

class Vertebrae extends Animal {
	public void identify() {
		System.out.println("I am an vertebrae.");
	}
}

class BonySkell extends Vertebrae {
	public void identify() {
		System.out.println("I have a bony skeleton.");
	}
}

class FourLimbs extends BonySkell {
	public void identify() {
		System.out.println("I have a bony skeleton and four limbs.");
	}
}

class AmnioticEgg extends FourLimbs {
	public void identify() {
		System.out
				.println("I have a bony skeleton and four limbs and I also have Amniotic eggs.");
	}
	public void amnioticStuff(){
		System.out.println("I was born out of an amniotic egg which provided protection and oxygen.");
	}
}

class Hair extends AmnioticEgg {
	public void identify() {
		System.out
				.println("I have a bony skeleton and four limbs and I also have Amniotic eggs. Also, I might be a hairy bastard.");
	}

	public void bangChest() {
		System.out
				.println("I'm the first species to be able to bang my chest!!!");
	}
}

class TwoPostOrbtialFenestrae extends AmnioticEgg {
	public void identify() {
		System.out
				.println("I have a bony skeleton and four limbs and I also have Amniotic eggs. Also, although I have a an amniotic egg, I'm not a hairy bastard");
	}
}

public class dope_Evolution extends Animal {
	public static void main(String[] args) {
		System.out
				.println("This explains it: https://rentafriend2000.files.wordpress.com/2013/10/familiy-trees.gif although, except for the picture, everything on that blog is BS.\n And I thought I might try downcasting-uocasting with this family tree.");

		Hair Chewie = new Hair();
		Chewie.identify();
		System.out.println(Chewie+"\n");

		
		System.out.println("Testing Upcasting");
		AmnioticEgg a = Chewie;
		System.out.println(a);
		
		//AmnioticEgg AmnioticEgg, does whatever an AmnioticEgg can.
		a.identify();
		a.amnioticStuff();
		pet(a); //The output is weird but it's safe to say it's upcasted to Animal by default.
		// a.bangChest(); -- It can't bang its chest anymore.
		// Upcasting but still a "Hair"
		
		System.out.println("Upcasting done, recasting back.\n");

		// Cast Test
		if (Chewie instanceof Hair) {
			System.out
					.println("It's an ape(Hair)! Now i can safely downcast it back to a Hair, without a fear of failure.");
			Hair ChewieBro = (Hair) Chewie;
			System.out.println(ChewieBro);
			ChewieBro.bangChest(); // It can bang its chest again.
			ChewieBro.amnioticStuff(); //It's still a child of AmnioticEgg class.
		}

	}

}
