package assignment;

import java.util.ArrayList;

public class ArrayList_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nagpur");
		al.add("Chandrapur");
		
		System.out.println("Actual arraylist :" + al);
		
		String[] stral = new String[al.size()];
		al.toArray(stral);
		System.out.println("Created Array content : ");
		for(String str : stral) {
			System.out.println(str);
		}
		

	}

}
