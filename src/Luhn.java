import java.util.Scanner;

public class Luhn {

	public boolean validate(String ccNum) {
		int sum = 0;
		boolean alternate = false;
		for (int i = ccNum.length() - 1; i >= 0; i--) {
			int n = Integer.parseInt(ccNum.substring(i, i + 1));
			if (alternate) {
				n = n * 2;
				if (n > 9) {
					n = (n % 10) + 1;
				}
			}
			sum = n + sum;
			alternate = !alternate;
		}
		return (sum % 10 == 0);
	}
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter credit card number.");
		String ccNumber = keyboard.next();

		Luhn x = new Luhn();
		System.out.println(x.validate(ccNumber));

	}

}
