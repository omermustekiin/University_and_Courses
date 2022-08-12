package deneme;

import java.util.Random;

import Quiz_Answers.Rectangle;

public class DikdortgenTest {

	public static void main(String[] args) {

		
		Dikdortgen d1= new Dikdortgen(3,1);
		Dikdortgen d2= new Dikdortgen(3,1);
		
		//System.out.println(d1);
		//System.out.println(d2);
		
		System.out.println("**************");
		
		d1.setGenislik(d1.getGenislik()*2);
		d1.setUzunluk(d1.getUzunluk()*2);
		d2.setGenislik(d2.getGenislik()*14);
		d1.setUzunluk(d2.getUzunluk()*14);
		
		if(d1.isEsit(d2)==false) {
			System.out.println("Üç tane yeni nesne üretiliyor...");
			Random r = new Random();
			Dikdortgen nesne1=new Dikdortgen(1+(r.nextInt(5)),(1+r.nextInt(5)));	
			Dikdortgen nesne2=new Dikdortgen(1+(r.nextInt(5)),(1+r.nextInt(5)));	
			Dikdortgen nesne3=new Dikdortgen(1+(r.nextInt(5)),(1+r.nextInt(5)));	
		}
		
		
		
		

	}

}
