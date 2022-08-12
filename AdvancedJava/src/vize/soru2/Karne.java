package vize.soru2;

public class Karne {
	
	private Ogrenci ogrenci;
	private String[] dersler;
	private int[] krediler;
	private int[] notlar;
	
	public Karne(Ogrenci ogrenci, String[] dersler, int[] krediler, int[] notlar) {
		this.ogrenci = ogrenci;
		this.dersler = dersler;
		this.krediler = krediler;
		this.notlar = notlar;
	}
	
	public double burOrtalama() {
		double toplam = 0, krediToplam = 0;
		for(int i =0; i<notlar.length; i++) {
			toplam+= notlar[i]*krediler[i];
			krediToplam+= krediler[i];
		}
		return toplam/krediToplam;
	}
	
	public void yazKarne() {
		System.out.println(ogrenci.toString());
		System.out.println("Ders\tNot\tKredi");
		for(int i =0; i<notlar.length; i++) {
			System.out.println(dersler[i] + "\t" + notlar[i] + "\t" + krediler[i]);
		}
	}
	
	

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public String[] getDersler() {
		return dersler;
	}

	public void setDersler(String[] dersler) {
		this.dersler = dersler;
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
	
	
	
	

}
