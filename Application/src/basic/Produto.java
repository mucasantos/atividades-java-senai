package basic;

public class Produto {
	public String name;
	public double price;
	public int quantity;
	public String color;
	public String brand;
		 
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity; // igual this.quantity = this.quantity + quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	public void next() {
		
	}
}
