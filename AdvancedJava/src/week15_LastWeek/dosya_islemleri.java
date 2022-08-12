package week15_LastWeek;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class dosya_islemleri {

	public static void main(String[] args) throws IOException {
//		
//		addProduct();
//		
//		Scanner input = new Scanner(System.in);
//		for(int i = 0; i<3; i++) {
//			System.out.print("Prdocut Name: ");
//			String prd = input.next();
//			System.out.print("Price: ");
//			int prc = input.nextInt();
//			
//			addProduct(prd,prc);
		
		readProduct();
		//transfer();  //kopyalama iþlemi gerçekleþti
	}

	
	public static void addProduct() throws FileNotFoundException {
		File f = new File("D:\\Dersler\\3.sýnýf\\2.Dönem\\Ýleri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product"); //File sýnýfýndan bir nesne ürettik
		PrintWriter p = new PrintWriter(f);  //Yazma aracýmýza, file sýnýfýndaki nesneye yazacaðýmýz için f parametresi verdik.
		
		p.print("--PRDCT--");
		p.print("--PRÝCE--\n");
		p.close();
	}
	
	public static void addProduct(String productN, int price) throws IOException {
		
		FileWriter f = new FileWriter("D:\\Dersler\\3.sýnýf\\2.Dönem\\Ýleri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product", true); //buradaki true anlamý: Dosyanýn içindeki bilgiler kalsýn, silinmesin
		PrintWriter p =new PrintWriter(f);
		p.print(productN+"\t"+price+"\n");
		p.close();
	}
	
	public static void readProduct() throws FileNotFoundException {
		File f = new File("D:\\Dersler\\3.sýnýf\\2.Dönem\\Ýleri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product");
		
		Scanner input = new Scanner(f);
		while(true) {
			String row = input.nextLine(); //satýr satýr okuyoruz
			System.out.println(row);
		}
	
	}
	
	public static void transfer() throws IOException {
		File f = new File("D:\\Dersler\\3.sýnýf\\2.Dönem\\Ýleri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product");
		Scanner input = new Scanner(f);
		
		ArrayList<String> fileRecords=new ArrayList<String>();
		while(input.hasNext()) {
			String rows = input.nextLine();
			fileRecords.add(rows);
			
		}
		input.close();
		
		FileWriter f1 = new FileWriter("D:\\Dersler\\3.sýnýf\\2.Dönem\\Ýleri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product1");
		PrintWriter p = new PrintWriter(f1);
		
		for(String row: fileRecords) {
			p.println(row);
		}
		p.close();
	
		
	}
	
	public static void findCost() throws FileNotFoundException {
		File f = new File("D:\\Dersler\\3.sýnýf\\2.Dönem\\Ýleri Java Programlama\\AdvancedJava\\src\\week15_LastWeek\\Product");
		Scanner input = new Scanner(f);
		int sum=0;
		while(input.hasNext()) {
			String row = input.nextLine();
			String[] parts = row.split("\t"); //0.indiste name, ikinci indiste price var
			int price= Integer.parseInt(parts[1]);
			sum=sum+price;
		}
		System.out.println("Cost: "+sum);
	}
}






/*FÝNAL SINAVI AÇIKLAMASI

1 Açýklamalý soru 
1 dosya soru ()
1 gui sorusu (40-45 puan) -  Tasarým ve arkaplanda button actionlarý. Method tanýmlama vs ...(iki sayýyý bi methodla toplasýn)
1 þu yöntemi kullanrak çözünüz sorusu...

*/
	
	
	
	
	

