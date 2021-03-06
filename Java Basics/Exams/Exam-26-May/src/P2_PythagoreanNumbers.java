import java.util.Scanner;

public class P2_PythagoreanNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean found = false;
		int len = input.nextInt();
		int[] numbers = new int[len];
		for (int i = 0; i < len; i++) {
			numbers[i] = input.nextInt();
		}
		
		for (int a = 0; a < len; a++) {
			for (int b = 0; b < len; b++) {
				if (numbers[a] <= numbers[b]) {
					for (int c = 0; c < len; c++) {
						if ((numbers[a] * numbers[a] + numbers[b] * numbers[b] == numbers[c] * numbers[c])) {
							//System.out.println(numbers[a] + " " + numbers[b] + " " + numbers[c]);
							System.out.printf("%d*%d + %d*%d = %d*%d", numbers[a], numbers[a],
									numbers[b], numbers[b], numbers[c], numbers[c]);
							System.out.println();
							found = true;
						}
					}
				}
			}
		}
		if (!found) {
			System.out.println("No");
		}
	}
}
