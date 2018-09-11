
public class Product {
	protected String name;
	protected String description;
	protected double price;
	protected int productID;
	static int count = 0;

	


public Product(String n, String d, double p, double s) {
	count += 1;
	this.description = "Phone";
	this.price = p;
	this.productID = count;
}

public Product(String m, int s, String ty, boolean t, double p) {
	count += 1;
	this.description = "TV";
	this.productID = count;
	this.price = p;
}

public void print() {
	System.out.println("This product is a " + name + " " 
+ description + " it costs " + price + " and its id number is " + productID );
}





public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getProductID() {
	return productID;
}

public void setProductID(int productID) {
	this.productID = productID;
}




}
