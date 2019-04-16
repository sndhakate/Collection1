package assignment;

public class Student implements Comparable {
	int rollno; String name; int age;
	Student(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Student st = (Student) obj;
		if (age==st.age)
		return 0;
		else if (age>st.age)
			return 1;
		else
			return 1;
		
	}
}
