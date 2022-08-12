package deneme;

public class Karne {

	Ogrenci o;
	int [] krediler;
	int [] notlar;	
	String [] dersAdlari;
	
	public Karne(Ogrenci o, int[] krediler,  int[] notlar, String[] dersAdlari) {
		this.o=o;
		this.krediler=krediler;
		this.notlar=notlar;
		this.dersAdlari=dersAdlari;
	}

	public Ogrenci getO() {
		return o;
	}

	public void setO(Ogrenci o) {
		this.o = o;
	}

	public int[] getKrediler() {
		return krediler;
	}

	public void setKrediler(int[] krediler) {
		this.krediler = krediler;
	}

	public int[] getNotlar() {
		return notlar;
	}

	public void setNotlar(int[] notlar) {
		this.notlar = notlar;
	}

	public String[] getDersAdlari() {
		return dersAdlari;
	}

	public void setDersAdlari(String[] dersAdlari) {
		this.dersAdlari = dersAdlari;
	}
	

	
	
	
	
	
	
}
