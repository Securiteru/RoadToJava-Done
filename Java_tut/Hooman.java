package Java_tut;

public class Hooman implements info {
	private String name;

	public Hooman(String name) {
		super();
		this.name = name;
	}

	public void greet() {
		System.out.println("Hellloooo");
	}

	@Override
	public void showInfo() {
		System.out.println("Person name is " + name);

	}

}
