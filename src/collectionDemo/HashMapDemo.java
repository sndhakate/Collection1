package collectionDemo;

import java.util.HashMap;

public class HashMapDemo {
	
	   public static void main(String args[]) {
	   
	      // Create a hash map
	      HashMap<Integer, String> hm = new HashMap<>();
	      
	      // Put elements to the map
	      
	      hm.put(99 , "Pravin");
	      hm.put(86 , "Manish");
	      hm.put(78 , "Ayan");
	      hm.put(89 , "Dhawal");
	      hm.put(65 , "Gaurav");
	      hm.put(86 , "Rahul");
	      hm.put(72 , "Manish");
	      
	      System.out.println("Initial Size of the map :" + hm.size());
	      System.out.println("List of the Map :" + hm );
	      
	      System.out.println(hm.containsKey(89));   // containsKey Method
	      
	      System.out.println(hm.replace(78 , "Ankit"));   //replace method
	      System.out.println("After Relace :" + hm);
	      
	      System.out.println(hm.remove(65));	//remove method
	      System.out.println("After Remove :" + hm);
	      
	      System.out.println(hm.clone());		// clone method
	     	          
	      System.out.println(hm.putIfAbsent(68, "Vijay"));       //putIfAbsent method
	      System.out.println("After putIfAbsent method :" + hm);
	     
	   }
}
	    
































	      
	      /*// Get a set of the entries
	      Set set = hm.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      
	      // Deposit 1000 into Zara's account
	      double balance = ((Double)hm.get("Zara")).doubleValue();
	      hm.put("Zara", new Double(balance + 1000));
	      System.out.println("Zara's new balance: " + hm.get("Zara"));*/
	   
	


