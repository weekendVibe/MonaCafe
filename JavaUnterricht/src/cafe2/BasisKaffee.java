package cafe2;


public class BasisKaffee {
	private String name; 
	private double price; 
	private int numOfEspresso;
	private int numOfMilk;
	
	
		
	public BasisKaffee(String name, double price, int numOfEspresso, int numOfMilk) {
		this.name = name;
		this.price = price;
		this.numOfEspresso = numOfEspresso;
		this.numOfMilk = numOfMilk;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
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


	

}

