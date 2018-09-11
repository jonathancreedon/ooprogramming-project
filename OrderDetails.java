
public class OrderDetails {
Product pro;
int Quantity;


public OrderDetails(Product p, int q) {
	this.pro = p;
	this.Quantity = q;
}

public void print() {
	System.out.println("This order is for " + this.Quantity +" items of product: " + this.pro);
}
}
