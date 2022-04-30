package cocktailbar;

import java.util.Random;
import java.util.Scanner;

public class CocktrailDriveThrough {

	public CocktrailDriveThrough() {
	}
	
	static double kasse;

	
	public static void main(String[] args) {
		System.out.println("Willkommen bei Monas Kneipe.");

		Caipirinha caipirinha = new Caipirinha("Caipirinha", 10, false);
		WhiteRussian whiterussian = new WhiteRussian("White Russian", 9, false);
		Driver driver = new Driver("Driver", 3, false);
		PinaColada pinacolada = new PinaColada("Bahamas", 9, false);
		
		Cocktail[] cocktails = new Cocktail[4];
		cocktails[0] = caipirinha;
		cocktails[1] = whiterussian;
		cocktails[2] = driver;
		cocktails[3] = pinacolada;
		
		for (int i = 0; i < cocktails.length; i++) {
			
			if(!cocktails[i].getAlkohol())
			System.out.println(i+1 + " " + cocktails[i].getName() + " (" + cocktails[i].getPreis() + " Euro)" );
			
			//if(!cocktails[i].getAlkohol())
			//System.out.println("Der Cocktail kostet " + cocktails[i].getPreis() + " Euro");
		}
		
		System.out.println("Was möchten Sie trinken?");
		Scanner scanner = new Scanner(System.in);
		String cocktailName = scanner.next();
		for (int i = 0; i < cocktails.length; i++) {
			if(cocktails[i].getName().equals(cocktailName)) {
			
				kasse=cocktails[i].getPreis();
			}
		}
		System.out.println("Sie haben " + cocktailName + " bestellt.");
		System.out.println("Gesamtpreis: " + kasse);
	
		

	}

}
