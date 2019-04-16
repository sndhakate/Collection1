package assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo3 {
	public static void main(String[] args) {
			
	ArrayList Al = new ArrayList ();
	Al.add("First");
	Al.add("Second");
	Al.add("Third");
	Al.add("Random");
	
	System.out.println("Before actual arraylist :"+ Al);
	
	List list = new ArrayList ();
	list.add("one");
	list.add("two");
	Al.addAll(list);
	System.out.println("after copy ArrayList :" + Al);
	
	}
}
