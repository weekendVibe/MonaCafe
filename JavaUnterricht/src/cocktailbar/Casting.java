package cocktailbar;

public class Casting {

	public Casting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 100.09809;
		System.out.println(number);
		double number_int = (int)number;
		System.out.println(number_int);
		int number_int2 = (int) number;
		System.out.println(number_int2);
		
		long longNumber = 1234567890123456L;
		int intNumber = 123456789;
		System.out.println(Long.SIZE);
		System.out.println(Integer.SIZE);
	}

}
