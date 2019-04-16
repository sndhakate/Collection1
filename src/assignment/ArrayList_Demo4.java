package assignment;

import java.util.ArrayList;

public class ArrayList_Demo4 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList ();
		al.add("Zero");
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		System.out.println(" Actual Arraylist : "+ al);
		
		al.clear();  // this function delete all items from arraylist
		
		System.out.println("after clear arraylist :" + al);
		
	}

}
