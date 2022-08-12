package vize.soru7;

public abstract class Sekil {
	
	String renk;
	int x;
	int y;
	
	public Sekil(String renk, int x, int y) {
		this.renk = renk;
		this.x = x;
		this.y = y;
	}

	public abstract double area();
	
	@Override
	public String toString() {
		return String.format("Renk : %s, Koordinatlar(%d, %d)", renk, x, y);
	}
		
}
