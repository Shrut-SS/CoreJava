package Arraylist;

import java.util.Comparator;

public class Student {
	int age;
	String name;
	String sal;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age2) {
		this.age = age2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	public static Comparator<Student> StuNameComparator = new Comparator<Student>(){
		public int compare(Student s1,Student s2) {
			String StudentName1 = s1.getName().toUpperCase();
			String StudentName2 = s2.getName().toUpperCase();
			
			//ascending order
			return StudentName1.compareTo(StudentName2);
			
			//descending order
			//return StudentName2.compareTo(StudentName1);
			
		}
	};
	
}
