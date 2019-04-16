package assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList ();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		
		List list= new ArrayList();
		list.add("Second");
		list.add("Random");
		System.out.println(" Does arraylist contains all list element : "+ al.contains(al));
		
		list.add("one");
		
		System.out.println("does list contains all list elements? : " + al.contains(list));

}
}