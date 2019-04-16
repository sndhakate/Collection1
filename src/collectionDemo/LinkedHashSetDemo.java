package collectionDemo;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String args[]) {
	         // LinkedHashSet of String Type
		
	         LinkedHashSet<String> lhs = new LinkedHashSet<String>();

	         // Adding elements to the LinkedHashSet
	         lhs.add("Y");
	         lhs.add("QR");
	         lhs.add("T");
	         lhs.add("O");
	         lhs.add("Y");
	         lhs.add("BBC");
	         lhs.add("ZZ");
	         
	         System.out.println("size of the set  :" + lhs.size());
	         System.out.println("list of the set  :" +  lhs);

	         // LinkedHashSet of Integer Type
	         LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();

	         // Adding elements
	         lhs2.add(99);
	         lhs2.add(7);
	         lhs2.add(0);
	         lhs2.add(67);
	         lhs2.add(89);
	         lhs2.add(66);
	         lhs2.add(99);
	         lhs2.add(9);
	         System.out.println("size of the set  :" + lhs2.size());
	         System.out.println("list of the set  :" +  lhs2);

	         System.out.println(lhs.remove("Y"));
	         System.out.println(lhs2.remove(99));
	         
	         System.out.println("size of the set after deletion  :" + lhs.size() );
	         System.out.println("list of the set after deletion  :" +lhs);
	         
	         System.out.println("size of the set after deletion  :" + lhs2.size());
	         System.out.println("list of the set after deletion  :" +lhs2);
	    }
	}

	

