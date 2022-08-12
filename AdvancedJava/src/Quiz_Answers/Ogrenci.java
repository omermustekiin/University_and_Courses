package Quiz_Answers;

public class Ogrenci{
String ad, soyad, cinsiyet, kimlikNo;
int yas;
public Ogrenci(String ad, String soyad,int yas, String cinsiyet, String kimlikNo )
{
this.ad=ad;
this.soyad=soyad;
this.yas=yas;
this.cinsiyet=cinsiyet;
this.kimlikNo=kimlikNo;
}
public void setOgrenci(String ad, String soyad, int yas, String cinsiyet, String kimlikNo)
{
this.ad=ad;
this.soyad=soyad;
this.yas=yas;
this.cinsiyet=cinsiyet;
this.kimlikNo=kimlikNo;
}
public String getAd() {
return ad;
}
public String getSoyad() {
return soyad;
}
public int getYas() {
return yas;
}
public String getCinsiyet() {
return cinsiyet;
}
public String getKimlikNo() {
return kimlikNo;
}
// the method return the student's characteristic info
@Override
public String toString() {
return String.format("Kimlik:%s\nAd:%s\nSoyad:%s\nCinsiyet:%s\nYas:%d\n", getKimlikNo(),getAd(),getSoyad(),getCinsiyet(),getYas());
}
}