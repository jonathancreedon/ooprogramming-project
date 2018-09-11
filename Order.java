import java.util.ArrayList;

public class Order {
	ArrayList<OrderDetails> oList = new ArrayList<OrderDetails>();
	
	public void add(Product p, int q) {
		OrderDetails o = new OrderDetails(p, q);
		oList.add(o);
		
	}
	
	public void print() {
		for(int i = 0; i < oList.size(); i++) {
			System.out.println("Order number " + (i+1) + " = " + oList.get(i).Quantity + " items of " + oList.get(i).pro.getName());
					}
	}
}
