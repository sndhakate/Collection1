package collectionDemo;

import java.util.ArrayList;

public class ArraytListDemo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Initial the size al  :" + al.size());
		
		// add elements to ArrayList
		
		al.add("25");
		al.add("52");
		al.add("12");
		al.add("36");
		al.add("15");
		al.add("12");
		al.add("86");
		al.add("74");
		
		// Display the size of arraylist 
		System.out.println("size of Arraylist : " + al.size());
		System.out.println(al);         //elements in arraylist
		
		// Remove element from arraylist
		
		al.remove("36");   //here if we give al.remove(36); in boolean method object o it will not remove from arraylist that why we uesd input keys of arraylist in string values
		al.remove(2);
		System.out.println("size of al after deletion  :" + al.size());
		System.out.println("List of al  : " + al);
		
				
		System.out.println(al.get(4));      //print value in index no.4      //Size of arraylist start with index 0,1,2....
		
		System.out.println (al.contains(36));
		
			// Iteration
		for (int i=0 ; i< al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al.addAll(al));   // addAll means adding remaining element once again in the set or list
											// therefore size of the list here is 12
		// adding another element after deletion and addAll method
		
		al.add(1, "55");
		al.add(5, "03");
		
		System.out.println("Size of arraylist after addition  :" + al.size());
		System.out.println("element in arraylist after addtion  :" + al);
		
		
	}
	
}
