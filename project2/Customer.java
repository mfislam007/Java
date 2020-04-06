package project2;

public class Customer {
	private int CustomerNumber;
	private String name;
	private String address;
	@Override
	public String toString() {
		return "Customer [CustomerNumber=" + CustomerNumber + ", name=" + name
				+ ", address=" + address + "]";
	}
	public Customer(int customerNumber, String name, String address) {
		super();
		CustomerNumber = customerNumber;
		this.name = name;
		this.address = address;
	}

	
}
