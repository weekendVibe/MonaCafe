package cocktailbar;

public class Cocktail {
	private String Name; 
	private int preis;
	private boolean alkohol; //true = Alkohol, false = Alkoholfrei
	
	public Cocktail(String Name,int preis,boolean alkohol) {
		this.Name = Name;
		this.preis = preis;
		this.alkohol = alkohol;
	}
	
public String getName() {
	return Name;
}
	
public int getPreis() {
	return preis;
	}
	
public boolean getAlkohol() {
	return alkohol;
	}

public void setName(String name) {
	Name = name;
}

public void setPreis(int preis) {
	this.preis = preis;
}

public void setAlkohol(boolean alkohol) {
	this.alkohol = alkohol;
}
	


}
