import java.util.Scanner;


public class P6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] data = input.nextLine().toLowerCase().split("[^a-zA-Z]+");
		String searchWord = input.nextLine();
		int counter = 0;
		for (String word : data) {
			if (word.equals(searchWord)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
