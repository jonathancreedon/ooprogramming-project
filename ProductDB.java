import java.util.ArrayList;

public class ProductDB {
ArrayList<Product> pList = new ArrayList<Product>();


public void add(Product p) {
	pList.add(p);
}

public void remove(Product p) {
	pList.remove(p);
}

public Product find(int p) {
	Product o = null;
	for(int i = 0; i < pList.size(); i++) {
		if(pList.get(i).productID == p) {
			o = pList.get(i);
		}
	}
	return o;
}
}
