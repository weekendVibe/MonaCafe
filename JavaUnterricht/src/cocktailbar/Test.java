package cocktailbar;

import java.util.Random;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int number = random.nextInt(50);
		if(number<50)
		System.out.println(number+50);
	}

}
