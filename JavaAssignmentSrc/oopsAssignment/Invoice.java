package oopsAssignment;
public class InvoiceTest{
	private String number,description;
	private int quantity;
	private double price;
	public InvoiceTest(String number,String description,int quantity,double price) {
		this.number = number;
		this.description = description;
		this.quantity = quantity > 0 ? quantity : 0;
		this.price = price>0 ? price : 0.0;
	}
	
}
public class Invoice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
