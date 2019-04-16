package assignment;

import java.util.Comparator;

public class NameComparer implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student_1 s1 = (Student_1) o1;
		Student_1 s2 = (Student_1) o2;
		return s1.name.compareTo(s2.name);
	}
}
