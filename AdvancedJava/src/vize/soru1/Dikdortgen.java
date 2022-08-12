package vize.soru1;

public class Dikdortgen {
	
	private double genislik;
	private double uzunluk;
	
	public Dikdortgen(double genislik, double uzunluk) {
		setGenislik(genislik);
		setUzunluk(uzunluk);
	}
	public double getGenislik() {
		return genislik;
	}
	public void setGenislik(double genislik) {
		this.genislik = (genislik < 0) ? 3 : genislik;
	}
	public double getUzunluk() {
		return uzunluk;
	}
	public void setUzunluk(double uzunluk) {
		this.uzunluk = (uzunluk < 0) ? 3 : uzunluk;
	}
	
	public double alan() {
		return getGenislik()*getUzunluk();
	}
	
	public double[] alan(Dikdortgen d1) {
		double[] alanlar = new double[2];
		alanlar[0] = this.getGenislik()*this.getUzunluk();
		alanlar[1] = d1.getGenislik()*d1.getUzunluk();
		return alanlar;
	}
	
	public double cevre() {
		return (getGenislik()+getUzunluk())*2;
	}
	
	public static boolean isEsit(Dikdortgen d1, Dikdortgen d2) {
		if(d1.getGenislik()==d2.getGenislik() && d1.getUzunluk()==d2.getUzunluk())
			return true;
		return false;
	}
	
	
	

}
