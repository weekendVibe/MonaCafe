package cocktailbar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Passwort {
	
	public Passwort() {
	}
	

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Benutzername:");
				String passwort = scanner.nextLine();
				System.out.println("Passwort:");
				int passwort1 = scanner.nextInt();
				
						
			System.out.println("Sie werden nun eingeloggt");

			
