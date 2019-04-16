package collectionDemo;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo {
	
	
	     public static void main(String args[]) {
	         // TreeSet of String Type
	         TreeSet<String> ts = new TreeSet<String>();

	         // Adding elements to TreeSet<String>
	         ts.add("ABC");
	         ts.add("String");
	         ts.add("Tang");
	         ts.add("Pen");
	         ts.add("Ink");
	         ts.add("Pravin");
	         ts.add("Pen");
	         ts.add("Gaurav");

	         System.out.println("Size of the Set  :" + ts.size());
	         System.out.println("List of the Set : " +ts);     //Displaying TreeSet 
	         
	         System.out.println(ts.removeAll(ts));              // removeall method
	         System.out.println("size of the set after removing all  :" + ts.size());
	         
	         ts.addAll(ts);
	         ts.add("Mayank");
	         ts.add("Swapnil");
	         ts.add("Vaibhav");
	         System.out.println("Size of Set  :" +ts.size());
	         System.out.println("List of set" + ts);
	         
	         
	            
	         
	         
	         
	         // TreeSet of Integer Type
	         TreeSet<Integer> ts2 = new TreeSet<Integer>();

	         // Adding elements to TreeSet<Integer>
	         ts2.add(88);
	         ts2.add(7);
	         ts2.add(101);
	         ts2.add(0);
	         ts2.add(3);
	         ts2.add(222);
	         System.out.println("Size of the Set  :" + ts2.size());
	         System.out.println("List of the Set : " +ts2);
	    }
	 }