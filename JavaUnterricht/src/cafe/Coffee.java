package cafe;

public class Coffee {
	private double price; 
	private String name;
	private int numOfEspresso;
	private int numOfMilk;
	private int numOfSirup;
	private boolean addWhippedCream;
	private boolean addChocolateChips;
		

	public Coffee(double price, String name, int numOfEspresso, int numOfMilk) {
		super();
		this.price = price;
		this.name = name;
		this.numOfEspresso = numOfEspresso;
		this.numOfMilk = numOfMilk;
		this.numOfSirup = 0;
		this.addWhippedCream = false;
		this.addChocolateChips = false;
	}


	public static void main(String[] args) {
		Coffee coffee = new Coffee(3.5, "Hauskaffee", 2, 1);
		Coffee cappuchino = new Coffee(4.5, "Rom", 2, 2);
		Coffee latteMachiato = new Coffee(5, "Florenz", 2, 3);
		Coffee espresso = new Coffee(3, "Milano", 1, 0);
		
		System.out.println(cappuchino.getNumOfMilk());
		
		
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumOfEspresso() {
		return numOfEspresso;
	}


	public void setNumOfEspresso(int numOfEspresso) {
		this.numOfEspresso = numOfEspresso;
	}


	public int getNumOfMilk() {
		return numOfMilk;
	}


	public void setNumOfMilk(int numOfMilk) {
		this.numOfMilk = numOfMilk;
	}


	public int getNumOfSirup() {
		return numOfSirup;
	}


	public void setNumOfSirup(int numOfSirup) {
		this.numOfSirup = numOfSirup;
	}


	public boolean isAddWhippedCream() {
		return addWhippedCream;
	}


	public void setAddWhippedCream(boolean addWhippedCream) {
		this.addWhippedCream = addWhippedCream;
	}


	public boolean isAddChocolateChips() {
		return addChocolateChips;
	}


	public void setAddChocolateChips(boolean addChocolateChips) {
		this.addChocolateChips = addChocolateChips;
	}
	
	

}
