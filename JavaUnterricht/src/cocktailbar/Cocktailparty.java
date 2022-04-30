package cocktailbar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Cocktailparty {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\MonaS\\eclipse-workspace\\Cocktailbar\\src\\cocktailDice.txt";
		FileWriter fileWriter = new FileWriter(path, true);
		Driver driver = new Driver("Ferrari", 6, false);
		PinaColada pinacolada = new PinaColada("Bahamas", 9, true);
		WhiteRussian whiterussian = new WhiteRussian ("Moskau", 9, true);
		Caipirinha caipirinha = new Caipirinha("Caipi", 8, true); 
		
		

		Cocktail[] cocktails = new Cocktail[10];
//		cocktails[0] = pinacolada;
//		cocktails[1] = pinacolada;
//		cocktails[2] = pinacolada;
//		cocktails[3] = whiterussian;
//		cocktails[4] = whiterussian;
//		cocktails[5] = driver;
//		cocktails[6] = driver;
//		cocktails[7] = driver;
//		cocktails[8] = driver;
//		cocktails[9] = driver; 

		for (int i = 0; i < 2; i++) {
			cocktails[i] = pinacolada;
		}
		
		for (int i = 3; i < 7; i++) {
			cocktails[i] = whiterussian;
		}
		
		for (int i = 7; i < 8; i++) {
			cocktails[i] = caipirinha; 
		}

		for (int i = 8; i < cocktails.length; i++) {
			cocktails[i] = driver;
		}

//		for (int i = 0; i < cocktails.length; i++) {
//			System.out.println(cocktails[i].getName());
//		}

		Random würfel = new Random();
		int würfelNumber = würfel.nextInt(6)+1;
		int würfelNumber2 = würfel.nextInt(6)+1;
		System.out.println(würfelNumber+","+würfelNumber2);

		int option = würfel.nextInt(2);
//		System.out.println(option);

		switch (option) {
		case 0:
			String text = "Sie haben " + cocktails[0].getName() + " bestellt.";
			String text2 = "Der Cocktail kostet " + (würfelNumber+würfelNumber2) + " Euro" +"(Originalpreis:"+cocktails[0].getPreis()+")";
			fileWriter.write(text);
			fileWriter.write(text2);
			fileWriter.close();
			System.out.println(text);
			System.out.println(text2);
		
			break;
		case 1:
			String text3 = "Sie haben " + cocktails[5].getName() + " bestellt." + " Der Cocktail kostet "
					+ (würfelNumber+würfelNumber2) + " Euro"+"(Originalpreis:"+cocktails[5].getPreis()+")";
			fileWriter.write(text3);
			fileWriter.close();
			System.out.println(text3);
			
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}
}
