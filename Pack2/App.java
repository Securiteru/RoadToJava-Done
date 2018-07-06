package Pack2;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();

		Plant plant2 = tree;
		plant2.grow();
		tree.shedLeaves();

		int inty = 88;
		System.out.println(inty);
		short shortValue = 55;
		System.out.println(shortValue);
		byte byteValue = 20;
		System.out.println(byteValue);

		
	}

}
