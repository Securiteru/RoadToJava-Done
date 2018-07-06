package Project_Adi;

public class Testy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";

			}

			System.out.print(beerNum + " " + word + " of beer on the wall, ");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.print("Take one down. ");
			System.out.println("Pass it around");

			beerNum = beerNum - 1;

			if (beerNum > 1) {
				System.out.println(beerNum + " " + word
						+ " of beer on the wall.");
				System.out.println(" ");
			} else {

				switch (beerNum) {

				case 1:
					beerNum = 1;
					System.out.println(beerNum + " " + "bottle"
							+ " of beer on the wall.");
					System.out.println(" ");
					break;
				case 2:
					beerNum = 0;
					System.out.println("No more bottles of beer on the wall");
					System.out
							.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
					break;
				}
			}
		}
	}
}
