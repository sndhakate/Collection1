package assignment;

import java.util.ArrayList;

public class ArrayList_Demo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("JAVA");
		al.add("C++");
		al.add("PERL");
		al.add("PHP");
		
		System.out.println(al);
		
		System.out.println("element at index 1  :" + al.get(1));
		
		System.out.println("does list contains JAVA  :" + al.contains("JAVA"));
		
		al.add(2, "PLAY");
		System.out.println("list after addition : " + al);  //list after addition
		System.out.println("is arraylist is empty  :" + al.isEmpty() );
		System.out.println("index of PERL :" + al.indexOf("PERL"));
		System.out.println("size of the arraylist :" + al.size());
		
		
	}
	
	
	
	
	
}
