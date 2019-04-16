package assignment;

import java.util.HashMap;

public class HashMap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String,String> ();
		
		hm.put("First ", "Java");
		hm.put("Second ", "By");
		hm.put("Third ", "Kiran");
		System.out.println("List of Map :" + hm);
		
		HashMap<String, String> hm1 = new HashMap<String, String> ();
		hm.put("c1", "Java");
		hm.put("c2", "Selenium");
		hm.putAll(hm1);
		System.out.println("List of Map :" + hm);

	}

}
