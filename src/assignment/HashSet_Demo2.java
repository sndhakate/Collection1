package assignment;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
