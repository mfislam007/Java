package project2;

public class OrderAssign {

private String product;
private Double price;
private int quantity;
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
 public Double sum(){
	 return price*quantity; 
 }
}
