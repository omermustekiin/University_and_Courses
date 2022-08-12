package vize.soru1;

import java.util.Random;

public class DikdortgenTest {
	
	public static void main(String[] args) {
		
		Dikdortgen d1 = new Dikdortgen(3, 6);
		Dikdortgen d2 = new Dikdortgen(6, 12);
		
		System.out.println("d1 bilgiler : " + d1.getGenislik() + " " + d1.getUzunluk());
		System.out.println("d2 bilgiler : " + d2.getGenislik() + " " + d2.getUzunluk());
		
		System.out.println(d1.cevre() + " " + d1.alan()); //soruda istenmiyor
		
		d2.setGenislik(d2.getGenislik()*2);
		d2.setUzunluk(d2.getUzunluk()*2);
		
		d1.setGenislik(d1.getGenislik()*14);
		d1.setUzunluk(d1.getUzunluk()*14);
		
		System.out.println("d1 bilgiler : " + d1.getGenislik() + " " + d1.getUzunluk());
		System.out.println("d2 bilgiler : " + d2.getGenislik() + " " + d2.getUzunluk());
		
		if(Dikdortgen.isEsit(d1, d2)) {
			
		}else {
			Random r = new Random();
			int g1 = r.nextInt(5) + 1;
			int u1 = r.nextInt(5) + 1;
			int g2 = r.nextInt(5) + 1;
			int u2 = r.nextInt(5) + 1;
			int g3 = r.nextInt(5) + 1;
			int u3 = r.nextInt(5) + 1;
			
			Dikdortgen dr1 = new Dikdortgen(g1, u1);
			Dikdortgen dr2 = new Dikdortgen(g2, u2);
			Dikdortgen dr3 = new Dikdortgen(g3, u3);
			
			System.out.println(dr1);
			System.out.println(dr2);
			System.out.println(dr3);
		}
		
	}

}
