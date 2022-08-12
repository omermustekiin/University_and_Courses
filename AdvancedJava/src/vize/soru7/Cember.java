package vize.soru7;

public class Cember extends Sekil{
	
	int r;
	
	public Cember(String renk, int x, int y, int r) {
		super(renk, x, y);
		this.r = r;
	}

	@Override
	public double area() {
		return Math.PI*r*r;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" Area : " + area();
	}

	

}
