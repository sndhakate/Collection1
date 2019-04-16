package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo1 {
	public static void main(String[] args) {
		ArrayList Al = new ArrayList();
		
		Al.add("Pune");
		Al.add("Mumbai");
		Al.add("Nagpur");
		Al.add("Chandrapur");
		 Iterator<String> itr= Al.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	
	}

}
