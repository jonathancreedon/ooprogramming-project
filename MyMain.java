import java.util.*;
public class MyMain {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Customer> cList = new ArrayList<Customer>();
		
		Phone p1 = new Phone("Samsung", "Galaxys6", 45.9, 80.3);
		Phone p2 = new Phone("Apple", "IPhone 7", 78.9, 78.3);
		Phone p3 = new Phone("Apple", "IPhone 8", 89.4, 90.4);
		p3.print();
		TV t1 = new TV("Sony", 56, "LCD", false, 200.2);
		TV t2 = new TV("Sony", 41, "Plasma", true, 500.7);
		t2.print();
		
		ProductDB database = new ProductDB();
		database.add(p1);
		database.add(p2);
		database.add(p3);
		database.add(t1);
		database.add(t2);
		
		Customer jack = new Customer("Jack", "Dublin");
		cList.add(jack);
		Customer jill = new Customer("Jill", "Cork");
		cList.add(jill);
		
		Order o1 = new Order();
		o1.add(p1, 2);
		o1.add(p2, 5);
		o1.add(p3, 1);
		
		Order o2 = new Order();
		o2.add(t1, 1);
		o2.add(t2, 2);
		
		jack.addOrder(o1);
		jill.addOrder(o2);
		System.out.println("done");
		
		
		
		 int menuChoice = 6;
	       do {
	       System.out.println("\nPlease enter a menu option");
	       System.out.println("\n1. Create a new Phone\t2. Search for product with product id\t3. Display all Products\t4. Order Products\t5. Display all Orders\t6. Quit");
	           
	       System.out.println("\nEnter a choice: ");
	       menuChoice = Integer.parseInt(input.nextLine());
	           

	           if (menuChoice == 1)
	           {
	        	   String make = null, model = null;
	        	   double storage = 0, price = 0;
	        	   
	        	   Phone p = new Phone(make, model, storage, price);
	        	   
	        	   System.out.println("Enter make of phone: ");
	        	   make = input.nextLine();
	        	   p.setMake(make);
	        	   
	        	   System.out.println("Enter model of phone: ");
	        	   model = input.nextLine();
	        	   p.setModel(model);
	        	   
	        	   System.out.println("Enter storage capacity of phone: ");
	        	   storage = Double.parseDouble(input.nextLine());
	        	   p.setStorage(storage);
	        	   
	        	   System.out.println("Enter price of phone: ");
	        	   price = Double.parseDouble(input.nextLine());
	        	   p.setPrice(price);
	        	   
	        	   database.add(p);
	        	  
	           } else if (menuChoice == 2) {
	        	   int p = 0;
	        	   
	        	   System.out.println("Enter productID: ");
	        	   p = Integer.parseInt(input.nextLine());
	        	   
	        	   (database.find(p)).print();
	               
	 			    }else if(menuChoice == 3) {
	 			    	for(int i = 1; i < (database.pList.size() + 1); i++)
	 			    		(database.find(i)).print();
	 			    	
	 			    }else if(menuChoice == 4) {
	 			    	Order o = new Order();
	 			    	String c = null;
	 			    	String a = null;
	 			    	int p = 0;
	 			    	int q = 0;
	 			    	Customer cu;
	 			    	
	 			    	System.out.println("Enter customer name: ");
	 			    	c = input.nextLine();
	 			    	
	 			    	//System.out.println("Enter customer address: ");
	 			    	//a = input.nextLine();
	 			    	for(int i = 0; i < cList.size(); i++) {
	 			    		String t = cList.get(i).name;
	 			    		
	 			    	
	 			    	if( c.equals(t) ) {
	 			    		
	 			    	
	 			    	int orderChoice = 0;
	 			    	do {System.out.println("Enter -1 to quit(Any other number to order again): ");
	 			    	orderChoice = Integer.parseInt(input.nextLine());
	 			    	if(orderChoice != -1) {
	 			    	System.out.println("Enter product ID: ");
	 			    	p = Integer.parseInt(input.nextLine());
	 			    	
	 			    	System.out.println("Enter quantity: ");
	 			    	q = Integer.parseInt(input.nextLine());
	 			    	
	 			    	
	 			    	o.add(database.find(p), q);
	 			    	cList.get(i).addOrder(o);
	 			    	System.out.println("You ordered " + q + " " + database.find(p).getName());}}while(orderChoice != -1);
	 			    	}}
	 			    	
	 			    	System.out.println(jack.uList.size());
	 			    	
	 			    	
	 			    }else if(menuChoice == 5) {
	 			    	String n;
	 			    	
	 			    	
	 			    	System.out.println("Enter Customer name: ");
	 			    	n = input.nextLine();
	 			    	
	 			    	
	 			    	for(int i = 0; i < cList.size(); i++) {
	 			    		String t = cList.get(i).name;
	 			    		if( n.equals(t) ) {
	 			    			
	 			    			cList.get(i).uList.get(0).print();
	 			    			
	 			    		} 
	 			    		
	 			    	}
	 			    	
	 			    }
	           }while (menuChoice<6);
	       System.out.println("Goodbye");
	}
}
