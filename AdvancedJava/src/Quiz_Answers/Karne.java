package Quiz_Answers;

public class Karne{
Ogrenci o;
int[] notlar;
int[] kredi;
String[] dersAd;
public Karne(Ogrenci o,String[] dersAd, int[] notlar1, int[] kredi)
{
this.o=o;
this.dersAd=dersAd;
this.notlar=notlar1;
this.kredi=kredi;
}
public Ogrenci getO() {
return o;
}
public void setO(Ogrenci o) {
this.o = o;
}
public int[] getNotlar() {
return notlar;
}
public void setNotlar(int[] notlar) {
this.notlar=notlar;
}
public int[] getKredi() {
return kredi;
}
public void setKredi(int[] kredi) {
this.kredi=kredi;
}
public void yazKarne() {
System.out.println(o);
System.out.println("DersAd\tDersNot\tDersKredi\t");
for (int i=0;i<3;i++)
{
System.out.println(dersAd[i]+"\t"+notlar[i]+"\t"+kredi[i]);
}
findOrt();
}
public void findOrt()
{
int toplam=0;
int krediToplam=0;
double avg;
for (int i=0;i<kredi.length;i++)
{
toplam+=notlar[i]*kredi[i];
krediToplam+=krediToplam+kredi[i];
}
avg=toplam/krediToplam;
System.out.println("Aðýrlýklý Ortalama:"+avg);
}
}