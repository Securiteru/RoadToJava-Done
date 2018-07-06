package Java_book;

public class PhraseMachine {

	public static void main(String[] args) {

		// arrays of Strings containing words

		String[] subject = { "Doctor", "Athlete", "Scientist", "Teacher",
				"Politician", "Mechanic", "Programmer", "Priest", "Lawyer",
				"Superhero", "Dentist", "Statistician", "Surgeon", "Nurse",
				"Businessman" };
		String[] verb = { "study", "run", "sleep", "swim", "read", "dream",
				"dive", "travel", "love", "eat", "think" };
		String[] adjective = { "better", "faster", "stronger", "slower",
				"less", "more", "worse", "less" };

		// int variables that were passed the length of the lists.

		int subjectLength = subject.length;
		int verbLength = verb.length;
		int adjectiveLength = adjective.length;

		// int variables that were passed a random number between 0 and
		// [almost]1 which we then multiply by the string length in order to get
		// a word from index 0 to max and lastly we cast it as an int in order
		// to select a word from the Array at that index

		int rand1 = (int) (Math.random() * subjectLength);
		int rand2 = (int) (Math.random() * verbLength);
		int rand3 = (int) (Math.random() * adjectiveLength);

		// a StringBuilder that forms the phrase we need!

		StringBuilder phrase = new StringBuilder();

		phrase.append("You would be a great ");
		phrase.append(subject[rand1]);
		phrase.append(" if you would only ");
		phrase.append(verb[rand2]);
		phrase.append(" ");
		phrase.append(adjective[rand3]);
		phrase.append("!");

		// converts the value of phrase instance to a String.
		System.out.println(phrase.toString());

		int x = 3;
		while (x > 0) {

			if (x > 2) {
				System.out.print("a");
			}
			x = x - 1;
			System.out.print("-");

			if (x == 2) {
				System.out.print("b c");
			}
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
		}

		System.out.printf("\n");

		int z = 0;
		int y = 0;
		while (z < 5) {

			z = z + 1;
			y = z + y;

			System.out.print(z + "" + y + " ");
			z = z + 1;
		}
		
	}

}
