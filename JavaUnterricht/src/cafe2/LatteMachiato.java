package cafe2;


public class LatteMachiato extends BasisKaffee{
	private boolean addChocolateChips;
	private boolean addWhippedCream; 

	public LatteMachiato(String name, double price, int numOfEspresso, int numOfMilk, boolean addChocolateChips, boolean addWhippedCream) { // true = mit ChocChips , int numOfSirup, boolean addChocolateChips
			super(name, price, numOfEspresso, numOfMilk);
			this.setName("Florenz");
			this.addChocolateChips=addChocolateChips;
			this.addWhippedCream=addWhippedCream; 
		}
		
	}

