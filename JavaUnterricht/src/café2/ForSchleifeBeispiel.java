package café2;

import java.util.ArrayList;

public class ForSchleifeBeispiel {

	public static void main(String[] args) {
		ArrayList<String> coffees = new ArrayList<>();
		coffees.add("Americano");
		coffees.add("Rome");
		coffees.add("Florenz");
		coffees.add("Rome");
		coffees.add("Americano");
		String storno = "Mona";
		
		if(coffees.contains(storno)) {
			System.out.println("Rome ist da");
				
		}else {
			System.out.println("Der gegebene Wert existiert nicht in der Liste.");
		}
	}

}
