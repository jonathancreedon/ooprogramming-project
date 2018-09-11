
public class TV extends Product {
String make;
String type;
int size;
boolean three;

public TV(String m, int s, String ty, boolean t, double p) {
	super(m, s, ty, t, p);
	this.type = ty;
	this.three = t;
	this.size = s;
	this.make = m;
	this.name = m;
}

public void print() {
	super.print();
	
	System.out.println("This TV's make is " + make + " it's type is " + type + " and it's size is " + size
			+ " \nIs it 3D capable? " + three + "\n");
	
}




public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public boolean isThree() {
	return three;
}
public void setThree(boolean three) {
	this.three = three;
}


}
