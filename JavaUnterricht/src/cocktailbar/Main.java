package cocktailbar;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	static int kasse;
	
	public static void main(String[] args) {
		Caipirinha caipirinha = new Caipirinha("Caipirinha", 10, true);
		WhiteRussian whiterussian = new WhiteRussian("White Russian", 9, true);
		Driver driver = new Driver("Driver", 3, false);
		PinaColada pinacolada = new PinaColada("Bahamas", 9, true);
		Caipirinha caipirinha2 = new Caipirinha("Caipirinha", 8, true);
		WhiteRussian whiterussian2 = new WhiteRussian("White Russian", 9, true);
		PinaColada pinacolada2 = new PinaColada("Bahamas", 9, true);
		Driver driver2 = new Driver("Driver", 5, false);
		Caipirinha caipirinha3 = new Caipirinha("Caipirinha", 8, true);
		WhiteRussian whiterussian3 = new WhiteRussian("White Russian", 9, true); 

		Random random = new Random();
		
		Cocktail[] cocktails = new Cocktail[10];
		cocktails[0] = caipirinha;
		cocktails[1] = whiterussian;
		cocktails[2] = driver;
		cocktails[3] = pinacolada;
		cocktails[4] = caipirinha2;
		cocktails[5] = whiterussian2;
		cocktails[6] = pinacolada2;
		cocktails[7] = driver2;
		cocktails[8] = caipirinha3;
		cocktails[9] = whiterussian3;
	
		int number = random.nextInt(9) + 1;// 1~10
		ArrayList<Cocktail> expensiveCocktails = new ArrayList<Cocktail>(); 

		System.out.println("Wie viele Personen sind da?");
		System.out.println(number + " Person(en) sind da");
		for (int i = 0; i < number; i++) {
			System.out.println("Was möchten Sie bestellen?");
			System.out.println("Menu:");
			for (int j = 0; j < cocktails.length; j++) {
				if (cocktails[j].getName() == "Caipirinha") {
					System.out.println("Ausverkauft");
				}
				if (cocktails[j].getPreis()>=10) {
					System.out.println(cocktails[j].getName() + " " + cocktails[j].getPreis() + " Euro, enthält Alkohol: "
						+ cocktails[j].getAlkohol());
					expensiveCocktails.add(cocktails[j]);
				}
				
				
				
			}
			int option = random.nextInt(9);
			
			
			switch (option) {
			case 0:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt.");
				System.out.println("Der Cocktail kostet " + cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 1:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt." + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 2:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt." + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 3:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 4:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 5:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 6:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 7:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 8:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 9:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
			case 10:
				System.out.println("Sie haben " + cocktails[option].getName() + " bestellt" + " Der Cocktail kostet "
						+ cocktails[option].getPreis() + " Euro");
				kasse += cocktails[option].getPreis();
				System.out.println(kasse);
				break;
				
			
				
			default:
				System.out.println("Leider nicht im Menü");
			}
		}
		for (int i = 0; i < expensiveCocktails.size(); i++) {
			System.out.println(expensiveCocktails.get(i).getName());
		}
	}
}