package cocktailbar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemIn {

	public SystemIn() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Geben Sie die erste Zahl ein:");
				int number1 = scanner.nextInt();
				System.out.println("Geben Sie die zweite Zahl ein:");
				int number2 = scanner.nextInt();
				if(number2==0) {
					System.out.println("0 ist nicht akzeptiert, bitte geben Sie noch eine Zahl ein");
					int newNumber=scanner2.nextInt();
					System.out.println("Sie haben "+newNumber+" eingegeben");
					number2 = newNumber;
				}
				System.out.println("Sie haben zwei Zahlen eingegeben:" + number1 + "," + number2);
				System.out.println("Addition:" + number1 + "+" + number2 + "=" + (number1 + number2));
				System.out.println("Subtration:" + number1 + "-" + number2 + "=" + (number1 - number2));
				System.out.println("Multiplikation:" + number1 + "*" + number2 + "=" + (number1 * number2));
				double ergebnis = number1 / number2;
				
				System.out.println("Division:" + number1 + "/" + number2 + "=" + (ergebnis));
			} catch (InputMismatchException e) {
				System.out.println("Error");
			} catch (ArithmeticException e) {
				System.out.println("Nicht durch Null dividieren.");
			}
		}
	}

}
