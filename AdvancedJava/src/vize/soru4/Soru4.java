 package vize.soru4;

public class Soru4 {
	
	public double sabitTahmin(int n) {
		double toplam = 0;
		for(int i=0; i<=n; i++) {
			toplam+= 1/(faktoriyel(i)*1.0);
		}
		return toplam;
	}
	
	public int faktoriyel(int n) {
		int sonuc = 1;
		for(int i =1; i<=n; i++) {
			sonuc*=i;
		}
		return sonuc;
	}
	
}
