package project2;

public class Manufacturing {
private String name;
private int number;
private int amount1;
private int stocknumber1;
private int amount2;
private int stocknumber2;
public Manufacturing(String name, int number){
this.name=name;
this.number=number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String toString(){
	return "Name: " + name + ", Number: " + number;
}
public double InventeryValue(){
	return amount1*stocknumber1*amount2*stocknumber2;
}
}
