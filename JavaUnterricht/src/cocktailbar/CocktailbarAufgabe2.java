package cocktailbar;

import java.util.Random;

public class CocktailbarAufgabe2 {

	public static void main(String[] args) {

	CocktailbarAufgabe2 cocktailbaraufgabe2 = new CocktailbarAufgabe2();
//	int diceNumber1 = cocktailbaraufgabe2.rollDice();
//	
//	int diceNumber2 = cocktailbaraufgabe2.rollDice();
//	System.out.println();
	
	for (int i = 1; i < 3; i++) {
	int dicenumber = cocktailbaraufgabe2.rollDice();
	System.out.println(i+". Versuch: " + dicenumber);
	}
	
//	int result = diceNumber1+diceNumber2;
//	System.out.println(diceNumber1 + diceNumber2 + " Euro");
	}
	
	public int rollDice() {
		Random würfel = new Random();
		int würfelNumber = würfel.nextInt(6)+1;
		//System.out.println(würfelNumber);
		return würfelNumber;
		
	}
}
	
