package project2;

import java.util.ArrayList;

public class Order {
private String OrderDate;
private int OrderId;
private String Name;
private ArrayList <OrderAssign> list = new ArrayList<>();

public Order(int OrderId, String Name,String OrderDate){
this.OrderId = OrderId;
this.Name = Name;
this.OrderDate = OrderDate;

}
public void NewOrder(String product, Double price, int quantity){
OrderAssign OrderCreate= new OrderAssign();
OrderCreate.setProduct(product);
OrderCreate.setPrice(price);
OrderCreate.setQuantity(quantity);
list.add(OrderCreate);
}
public Double OrderPrice(){
	double Total=0;
	for(int i=0; i<list.size(); i++){
	Total=Total+list.get(i).sum();
	}
	return Total;
}
public String toString(){
	StringBuilder stringbuilder = new StringBuilder();
	stringbuilder.append("OrderId :" + OrderId + "\n ");
	stringbuilder.append("Customer :" + Name + "\n ");
	stringbuilder.append("Order Date :" + OrderDate + "\n ");
    for(int i=0;i<list.size(); i++){
    stringbuilder.append("\n ");
    stringbuilder.append(list.get(i).getProduct());
    stringbuilder.append(list.get(i).getPrice());
    stringbuilder.append(list.get(i).getQuantity());
    
    
    }
    stringbuilder.append("\n ");
    stringbuilder.append("Total Price:" + OrderPrice() + "\n ");
	return stringbuilder.toString();
	
	
	
}
}