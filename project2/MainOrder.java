package project2;

public class MainOrder {

	public static void main(String[] args) {
		Order Order1 = new Order(1, "first", "02/02/2019");
		Order1.NewOrder("mobile", 1000.0, 10);
        Order1.NewOrder("Tv", 200.0, 2);
       System.out.println(Order1);
	}

}
