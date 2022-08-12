package vize.soru3;

public class Faktoriyel {
	
	public int bulFaktoriyel(int n) {
		int sonuc = 1;
		for(int i =1; i<=n; i++) {
			sonuc*=i;
		}
		return sonuc;
	}

	public void cizTablo() {
		for(int i =0; i<4; i++) {
			System.out.println("N\tN!\tN.(N-1)!\tN.(N-1).(N-2)!");
			System.out.println("!\t="+bulFaktoriyel(3)+"\t"+i+"."+(i-1)
					);
			
		}
	}
	
}
