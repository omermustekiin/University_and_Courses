package Quiz_Answers;

public class KarneTest
{
public static void main(String[] args){
Ogrenci r=new Ogrenci("Muhammed", "Ali", 14, "Erkek", "R124145");
// Sizler Scanner sýnýfýný kullanarak, diziye ilgili deðerleri atayabilirsiniz.
String[] dersAd= {"CENG1","CENG2","CENG3"};
int[] notlar= {100,90,70};
int[] kredi= {3,4,3};
Karne z=new Karne(r, dersAd, notlar, kredi);
z.yazKarne();
}
}