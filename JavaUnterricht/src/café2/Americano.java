package café2;

public class Americano extends BasisKaffee{

	private int caramelSirup=1;
	public Americano(String name, double price, int sumOfCoffee, int sumOfMilk, int caramelSirup) {
		super (name, price, sumOfCoffee, sumOfMilk);
		this.caramelSirup=caramelSirup;
		//this.setName ("New York");
	}

}
