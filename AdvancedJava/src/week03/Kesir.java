package week03;

public class Kesir {
	
	private int pay;
	
	private int payda;
	
	public Kesir() {}
	
	public Kesir(int pay, int payda) {
		this.pay = pay;
		this.payda = payda;
	}
	
	public int isEsit(Kesir k) {
		 if((this.getPay()==k.getPay()) && (this.getPayda()==k.getPayda())) {
			 return 1;
		 }
		 return 0;
	}
	
	public void displayKesir() {
		System.out.println("Pay : " + pay + "Payda : " + payda);
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getPayda() {
		return payda;
	}

	public void setPayda(int payda) {
		this.payda = payda;
	}
	
	
	
}
