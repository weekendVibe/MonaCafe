package cafe2;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static double kasse = 0; 
	private static ArrayList<String> kaffeeBestellungen = new ArrayList<String>();
	private static ArrayList<BasisKaffee> kaffeeListe = new ArrayList<BasisKaffee>();


	public static void main(String[] args) {
		Americano americano = new Americano ("New York", 3, 2, 2, 1);
		Espresso espresso = new Espresso ("Rome", 2, 2, 0);
		LatteMachiato latteMachiato = new LatteMachiato ("Florenz", 5, 2, 5, true, true);
		Americano americanoMitRum = new Americano ("Las Vegas", 7, 2, 5, 3); 
		//new Cappuchino ("Venice", 4, 2, 2);
		
		kaffeeListe.add(latteMachiato);
		kaffeeListe.add(espresso);
		kaffeeListe.add(americano);
		kaffeeListe.add(americanoMitRum);
		
		System.out.println("Unsere sensationelle Kaffeeauswahl:");

		for (int i = 0; i < kaffeeListe.size(); i++) {
			System.out.println(kaffeeListe.get(i).getName() + "  " + kaffeeListe.get(i).getPrice() + " ?" );
		}
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Was m?chten Sie bestellen? Geben Sie einen Kaffee an oder schreiben Sie Exit, um die Bestellung zu beenden.");
			System.out.println("Wenn Sie eine Bestellung stornieren m?chten geben Sie Storno und den Kaffeenamen ein.");
			System.out.println("-----------");
			
		
			
			try {
				
				String eingabe = scanner.nextLine();
				if(eingabe.equals(americano.getName())) {
					System.out.println("Sie haben " + eingabe + " bestellt.");
					System.out.println("Sie m?ssen " + americano.getPrice() + " Euro" + " bezahlen.");
					kaffeeBestellungen.add(eingabe);
					kasse += americano.getPrice();
				}
				else if(eingabe.equals(espresso.getName())) {
					System.out.println("Sie haben " + eingabe + " bestellt.");
					System.out.println("Sie m?ssen " + espresso.getPrice() + " Euro" + " bezahlen.");
					kaffeeBestellungen.add(eingabe);
					kasse += espresso.getPrice();
				}
				else if(eingabe.equals(latteMachiato.getName())) {
					System.out.println("Sie haben " + eingabe + " bestellt.");
					System.out.println("Sie m?ssen " + latteMachiato.getPrice() + " Euro" + " bezahlen.");
					kaffeeBestellungen.add(eingabe);
					kasse += latteMachiato.getPrice();
				}
				
				else if(eingabe.equals("Storno")) {
					System.out.println("Welche Bestellung m?chten Sie stornieren?");
					String storno = scanner.nextLine();
					if(kaffeeBestellungen.contains(storno)) {
						System.out.println(storno + " wurde storniert.");
						kaffeeBestellungen.remove(storno);
						
						for (int i = 0; i < kaffeeListe.size(); i++) {
							if(kaffeeListe.get(i).getName().equals(storno)) {
								kasse-= kaffeeListe.get(i).getPrice();
								break;
							}
						}
						
						System.out.println("Sie erhalten folgende Kaffees" + kaffeeBestellungen);
						
					}
					for (int i = 0; i < kaffeeBestellungen.size(); i++) {
						System.out.println(kaffeeBestellungen.get(i));
					}
					
//					else {
//						System.out.println(storno + " haben Sie nicht bestellt.");
//					}
				}
				
				else if(eingabe.equals("Exit")) {
					System.out.println("Danke f?r die Bestellung.");
					System.out.println("Das ist Ihre Bestellung "+ kaffeeBestellungen);
					break;
				}
				
				else {
					System.out.println("Sie haben Quatsch eingegeben.");
				}
			} catch (Exception e) {
			
				// TODO: handle exception
			}
			
		}
		
		
		
		//scanner.close();
		System.out.println("Total: " + kasse);
		
	}
	

	
	

}
