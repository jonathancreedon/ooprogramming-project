
public class Phone extends Product {
private String make, model;
double storage;

public Phone(String m, String mo, double p, double s) {
	super(m, mo, p, s);
	this.make = m;
	this.model = mo;
	this.name = this.make;
	this.storage = s;
}

public void print() {
	
	super.print();
	
	System.out.println("This product's make is " + make + " it's model is " 
+ model + " it stores " + storage + " GB of data\n");
}


public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getStorage() {
	return storage;
}

public void setStorage(double storage) {
	this.storage = storage;
}



}
