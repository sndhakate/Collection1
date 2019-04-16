package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Student_1 (101 ," Swapnil ", 25));
		al.add(new Student_1 (104 ," Gaurav ", 26));
		al.add(new Student_1 (105 ," Ankit ", 23));
		System.out.println("Sorting by name :");
		Collections.sort(al, new NameComparer());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student_1 st = (Student_1)itr.next();
			System.out.println(st.rollno + " "+ st.name + "" + st.age);
		}
		System.out.println("Sorting by age :");
		Collections.sort(al, new AgeComparer());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student_1 st = (Student_1)itr2.next();
			System.out.println(st.rollno + " "+ st.name + "" + st.age);
		}
		
	}
}
