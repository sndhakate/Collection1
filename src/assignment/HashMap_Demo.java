package assignment;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String,String> ();
		
		hm.put("one ", "Java");
		hm.put("two ", "By");
		hm.put("three ", "Kiran");
		System.out.println("List of Map :" + hm);
		System.out.println("Value of Second :" + hm.get("two"));  //get element from hashmap using key
		
		System.out.println("is hashmap is empty : " + hm.isEmpty());
		System.out.println(hm.remove("third"));
		System.out.println("list of map :" + hm);
		System.out.println("Size of hashmap :" + hm.size());

	}

}
