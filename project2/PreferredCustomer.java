package project2;

public class PreferredCustomer extends Customer{

	private double purchases;

	
	public PreferredCustomer(int customerNumber, String name, String address,double purchases) {
		super( customerNumber,  name,  address);
		this.purchases = purchases;
	}

	
	public double getPurchases() {
		return purchases;
	}


	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}


	@Override
	public String toString() {
		return super.toString()+ "PreferredCustomer [purchases=" + purchases + "]";
	}
	
	public void CalculateBonus(){
		if(purchases > 500 && purchases <1000){
			System.out.println("The bonus is 2% of the value of the purchases");
			System.out.println("The value of the purchases is = " +   purchases*0.98 );
		}
		if(purchases > 1000 ){
			System.out.println("The bonus is 2% of the value of the purchases");
			System.out.println("The value of the purchases is = " + purchases*0.95);
			
		}
	}
}
