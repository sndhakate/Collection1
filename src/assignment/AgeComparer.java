package assignment;

import java.util.Comparator;

public class AgeComparer implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student_1 s1 = (Student_1) o1;
		Student_1 s2 = (Student_1) o2;
		if(s1.age==s2.age)		
			return 0;
		else if(s1.age>s2.age)	
			return 1;
		else
			return -1;
	}
}
