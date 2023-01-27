package basicofjava;
import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number1 = s.nextInt();
		int number2 = s.nextInt();
		int number3 = s.nextInt();

		if (number1 <= 9 && number1 >= 1) {
			for (int i = 1; i <= number1; i++) {
				for (int j = 1; j <= number1 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i+" ");
				}
				System.out.println("");
			}
		}
		
		if (number2 <= 9 && number2 >= 1) {
			for (int i = 1; i <= number2; i++) {
				for (int j = 1; j <= number2 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i+" ");
				}
				System.out.println("");
			}
		}

		if (number3 <= 9 && number3 >= 1) {
			for (int i = 1; i <= number3; i++) {
				for (int j = 1; j <= number3 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i+" ");
				}
				System.out.println("");
			}
		}
	}

}

