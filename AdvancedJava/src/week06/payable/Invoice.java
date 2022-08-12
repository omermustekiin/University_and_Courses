package week06.payable;

public class Invoice implements IPayable{
	
	private String partNumber;
	private String partDescription;
	private int quantity;	//miktar
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}
	
	public Invoice() {
		// Boþ constructor'dan dolu constructor'ý çaðýrma
		this("A", "B", 5, 10);
		
	}
	
	
	@Override
	public double getPaymentAmount() {
		return getPaymentAmount()*getPricePerItem();
	}
	
	@Override
	public String toString() {
		return String.format("Part Number : %s Part Description : %s Quantity : %d Price Per Item : %f", partNumber, partDescription, quantity, pricePerItem);
	}

	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity<0?0:quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem<0?0:pricePerItem;
	}

	
	

}
