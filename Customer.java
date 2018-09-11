import java.util.ArrayList;

public class Customer {
String name;
String address;
ArrayList<Order> uList = new ArrayList<Order>();

public Customer(String n, String a) {
	this.name = n;
	this.address = a;
	
}

public void addOrder(Order o) {
	this.uList.add(o);
}


}
