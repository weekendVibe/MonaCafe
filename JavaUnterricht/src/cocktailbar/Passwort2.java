package cocktailbar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Passwort2 {

	public Passwort2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String id = "mona30";
		int password = 12345678;
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Benutzername: ");
				String benutzername = scanner.next();
				if (id.equals(benutzername)) {
					
					for (int i = 0; i < 3; i++) {
						System.out.println("Passwort: ");
						int passwort = scanner.nextInt();
						if (passwort==password) {
							System.out.println("Willkommen " + id +"!");
							scanner.close();
							break;
						}
						else {
							System.out.println("Das Passwort ist falsch.");
						}
					}
					System.out.println("Sie haben dreimal ein falsches Passwort eingegeben. Der Account wurde blockiert.");
					scanner.close();
					break;
				
				}
				else {
					System.out.println("Der Benutzername ist falsch.");
				}
				
			}catch(InputMismatchException e) {
				System.out.println("Passwort darf nur Zahlen enthalten.");
			}
		
		// TODO Auto-generated method stub

	}

}
}
