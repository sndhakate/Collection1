package assignment;

import java.util.HashSet;

public class HashSet_Demo1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet ();
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		System.out.println("List ot Set : " + hs);
		System.out.println("HashSet is empty or not : " + hs.isEmpty());
		
		System.out.println(hs.remove("Karvenagar"));
		System.out.println(hs);
		System.out.println("size of hashset :" + hs.size());
		System.out.println("does hashset contains first element :" + hs.contains("Java"));
		
		
	}

}
