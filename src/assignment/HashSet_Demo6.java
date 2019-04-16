package assignment;

import java.util.HashSet;

public class HashSet_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add("Java");
		hs.add("By");
		hs.add("Kiran");
		hs.add("Karvenagar");
		hs.add("Pune");
		
		System.out.println("First HashSet :" + hs);
		
		HashSet SubSet = new HashSet();
		SubSet.add("Java");
		SubSet.add("J2EE");
		SubSet.add("Selenium");
		
		System.out.println("Second HaashSet :" + SubSet);
		hs.retainAll(SubSet);
		
		System.out.println("" + "Common hashset content from both :" );
		System.out.println(hs);
		

	}

}
