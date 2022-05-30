package cafe2;


import java.util.ArrayList;

public class IfAnweisungBeispiel {

	public static void main(String[] args) {
		ArrayList<String> cocktails = new ArrayList<>();
		cocktails.add("Caipirinha");
		cocktails.add("WhiteRussian");
		cocktails.add("BloodyMary");
		//cocktails.add("PinaColada");
		
		if(cocktails.contains("PinaColada")) {
		System.out.println("PinaColada ist vorr?tig");
		
		}else {
	System.out.println("Pina Colada ist aus");
	

	}
	}
}
	
