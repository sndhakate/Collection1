package assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Random");
		al.add("Click");
		System.out.println("Actual Arraylisty : " + al);
		
		List list = al.subList(2, 4);
		
		System.out.println("SubList : " + list);
		
		
		

	}

}
