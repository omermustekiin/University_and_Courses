package vize.soru7;

public class Dikdortgen extends Sekil{
	
	int a;
	int b;
	
	public Dikdortgen(String renk, int x, int y, int a, int b) {
		super(renk, x, y);
		this.a = a;
		this.b = b;
	}

	@Override
	public double area() {
		return a*b;
	}

	@Override
	public String toString() {
		return super.toString() + " Area : " + area();
	}
	
	

}
