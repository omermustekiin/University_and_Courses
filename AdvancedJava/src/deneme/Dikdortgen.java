package deneme;


public class Dikdortgen {

	private int uzunluk;
	private int genislik;
	
	public Dikdortgen(int uzunluk, int genislik) {
		this.genislik=genislik;
		this.uzunluk=uzunluk;
	}
	
	public void setUzunluk(int uzunluk) {
		this.uzunluk= uzunluk<0 ? 3 :uzunluk;
	}
	public int getUzunluk() {
		return this.uzunluk;
	}
	public void setGenislik(int genislik) {
		this.genislik= genislik<0 ? 3 :genislik;
	}
	public int getGenislik() {
		return this.genislik;
	}
	
	public int getAlan() {
		return getUzunluk()*getGenislik();
	}
	public int getCevre(){
		return 2*(getGenislik()+getUzunluk());
	}
	public int[] alan(Dikdortgen d1) {
		int[] alanlar=new int[2];
		alanlar[0]=this.getGenislik()*this.getUzunluk();
		alanlar[1]=d1.getGenislik()*d1.getUzunluk();
		return alanlar;
	}

	public int[] cevre(Dikdortgen d1, int[] cevreler) {
		cevreler[0]=this.getCevre();
		cevreler[1]=d1.getCevre();
		return cevreler;	
	}
	
	public boolean isEsit(Dikdortgen d1) {
		boolean isEsit=false;
		if (this.getGenislik()==d1.getGenislik()&&this.getUzunluk()==d1.getUzunluk()) {
			isEsit=true;
			System.out.println("Dörtgenler eþit");
			return true;
		}else {
			System.out.println("Dörtgenler eþit deðil");
			return isEsit;
		}
			
	}
	
	/*public static boolean isEsit(Dikdortgen d1, Dikdortgen d2) {
		if(d1.getGenislik()==d2.getGenislik() && d1.getUzunluk()==d2.getUzunluk())
			return true;
		return false;
	}*/
	
	
	
	
	
}
