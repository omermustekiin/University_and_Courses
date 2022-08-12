package deneme;

public class Ogrenci {

	String ad, soyad, cinsiyet;
	int yas, kimlikNo;
	
	public Ogrenci(String ad, String soyad, String cinsiyet, int yas, int kimlikNo) {
		this.ad=ad;
		this.soyad=soyad;
		this.cinsiyet=cinsiyet;
		this.yas=yas;
		this.kimlikNo=kimlikNo;
	}
	
	public void setAll(String ad, String soyad, String cinsiyet, int yas, int kimlikNo) {
		this.ad=ad;
		this.soyad=soyad;
		this.cinsiyet=cinsiyet;
		this.yas=yas;
		this.kimlikNo=kimlikNo;
	}
	
	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public int getYas() {
		return yas;
	}

	public int getKimlikNo() {
		return kimlikNo;
	}
	
	@Override
	public String toString() {
		return String.format("Ad: %s, Soyad: %s, Cinsiyet: %s, Yas: %d, KimlikNo: %d",getAd(),getSoyad(),getCinsiyet(),getYas(),getKimlikNo());
	}

	
	
	
	
	
	
	
}
