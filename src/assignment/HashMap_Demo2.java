package assignment;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo2 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("First ", "Java");
		hm.put("Second ", "By");
		hm.put("Third ", "Kiran");
		
		System.out.println("list of Map :" + hm);
		
		Set<String> keys= hm.keySet();
		for(String key :keys) {
			System.out.println("Value of :" + key + "is:" + hm.get(key));
			
		}
		
	}

}
