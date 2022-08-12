package vize.soru7;

public class Kare extends Sekil{
	
	int a;
	
	public Kare(String renk, int x, int y, int a) {
		super(renk, x, y);
		this.a = a;
	}

	@Override
	public double area() {
		return a*a;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Area : " + area();
	}
	
	

}
