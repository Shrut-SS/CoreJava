package LinkedList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student1{
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
	public Student1(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}
}

class NameCompare implements Comparator<Student1>{
	public int compare(Student1 s1,Student1 s2) {
		return s1.getName().compareTo(s2.getName());
	}

}

public class UsingComparable {

	public static void main(String[] args) {
		PriorityQueue<Student1> pr=new PriorityQueue<Student1>(3,new NameCompare());
        Student1 s=new Student1("divya",7);
        Student1 s1=new Student1("pragati",8);
        Student1 s2=new Student1("hetal",9);
        pr.add(s);
        pr.add(s1);
        pr.add(s2);
        while(!pr.isEmpty()) {
        	System.out.println(pr.poll().getName());
        }

	}

}
