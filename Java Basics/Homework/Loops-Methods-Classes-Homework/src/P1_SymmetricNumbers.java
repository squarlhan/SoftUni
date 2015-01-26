import java.util.Scanner;


public class P1_SymmetricNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] numbers = input.nextLine().split("\\s+");
		int startNum = Integer.parseInt(numbers[0]);
		int endNum = Integer.parseInt(numbers[1]);
		for (int i = startNum; i <= endNum; i++) {
			String number = "" + i;
			String revNumber = new StringBuilder(number).reverse().toString();
			if (number.equals(revNumber)) {
				System.out.println(number);
			}
		}
	}

}
