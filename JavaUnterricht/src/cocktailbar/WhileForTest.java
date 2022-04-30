package cocktailbar;

public class WhileForTest {

	public static void main(String[] args) {
//		for(int i=0;i<10;i+=3) {
//			System.out.println(i);
//		}
		int i=0;
		while(true) {
			if (i==100) {
				break;
			}
			System.out.println(i);
			i+=2;
		}
	}

}
