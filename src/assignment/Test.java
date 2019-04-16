package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student (101 ," Swapnil ", 25));
		al.add(new Student (104 ," Gaurav ", 26));
		al.add(new Student (105 ," Ankit ", 23));
		
		Collections.sort(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student)itr.next();
		System.out.println(st.rollno + "" + st.name + "" + st.age);
		}
	}

}
