package vize.soru2;

public class Ogrenci {
	
	private String ad;
	private String soyad;
	private String yas;
	private String cinsiyet;
	private String tcno;
	
	public Ogrenci(String ad, String soyad, String yas, String cinsiyet, String tcno) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cinsiyet = cinsiyet;
		this.tcno = tcno;
	}
	
	@Override
	public String toString() {
		return String.format("Ad : %s, Soyad : %s, Yas : %s, Cinsiyet : %s, Tcno : %s", ad, soyad, yas, cinsiyet, tcno);
	}
	
	public void setAll(String ad, String soyad, String yas, String cinsiyet, String tcno) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cinsiyet = cinsiyet;
		this.tcno = tcno;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getTcno() {
		return tcno;
	}

	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
	
	
	
	

}
