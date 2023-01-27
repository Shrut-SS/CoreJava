package LinkedList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student{
	String name;
	int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this .grade = grade;
	}
	public Student(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}
}

class GradeComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		if(s1.grade<s2.grade) {
			return 1;
		}
		else if(s1.grade>s2.grade) {
			return -1;
		}else {
			return 0;
		}
	}
	
}



public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> pr=new PriorityQueue<Student>(3,new GradeComparator());
        Student s=new Student("divya",7);
        Student s1=new Student("pragati",8);
        Student s2=new Student("hetal",9);
        pr.add(s);
        pr.add(s1);
        pr.add(s2);
        while(!pr.isEmpty()) {
        	System.out.println(pr.poll().getName());
        }
	}

}
