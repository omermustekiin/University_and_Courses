package week03;

public class KesirTest {

	public static void main(String[] args) {
		
		Kesir k1 = new Kesir(10, 5);
		
		Kesir k2 = new Kesir(10, 5);
		
		if(k1.isEsit(k2)==1) {
			System.out.println("Esit!");
		}else {
			System.out.println("Esit degil!");
		}
		
	}

}
