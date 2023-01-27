package Arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
public class StudentManagement {

	public static void main(String[] args) {
		ArrayList<Student> studentArray=new ArrayList<Student>();
		int choice;
		String name;
		int age;
		Scanner sc=new Scanner (System.in);
		//Create infinte while loop
		while(true) {
			
			//Creating menu
			System.out.println("Press 1 for Add Student Details");
			System.out.println("Press 2 for show Student Details");
			System.out.println("Press 3 for Search Student by name");
			System.out.println("Press 4 for Delete User by name");
			System.out.println("Press 5 for Sort User by name");
			System.out.println("Press 6 for update age");
			System.out.println("Press 7 for treeset");
			System.out.println("Press 8 to Quit\n \n");
			
			//Asking user to make choice
			System.out.println("Make your choice");
			choice = sc.nextInt();
			
			//Creating switch case branch
			switch(choice) {
			
				//First case for finding the addition
			case 1:
				System.out.println("Enter the Student Name");
				name = sc.next();
				System.out.println("Enter the Student Age");
				age = sc.nextInt();
				Student st = new Student();
				st.setAge(age);
				st.setName(name);
				studentArray.add(st);
				System.out.println("Student Record has been added");
				break;
				
			//Second case for finding the difference
			case 2:
				System.out.println("----------------------------------------------------------");
				for(int i=0;i<studentArray.size();i++) {
					System.out.println("Student Records:"+(i+1));
					System.out.println("Student Name:"+studentArray.get(i).getName());
					System.out.println("StudentAge:"+studentArray.get(i).getAge());
					System.out.println("----------------------------------------------------------");
				}
				break;
				
			case 3:
				System.out.println("Enter the Student Name for search:");
				String nm = sc.next();
				int i1=0;
				
			case 4:
				
				
			case 5:
				Collections.sort(studentArray,Student.StuNameComparator);
				
				for(Student str: studentArray) {
					System.out.println(str.getName()+" "+str.getAge());
			
				}
				break;
				
			case 6:
				System.out.println("Enter the Student Name for search:");
				name = sc.next();
				System.out.println("Enter the Student Age:");
				age = sc.nextInt();
				
				for(int i=0;i<studentArray.size();i++) {
					if(studentArray.get(i).getName().contains(name)) {
						Student s1=studentArray.get(i);
						s1.setAge(age);
						studentArray.set(i, s1);
						
					}
				}
				break;
			
			case 7:
				TreeSet<Student> tree_set = new TreeSet<Student>(Student.StuNameComparator);
				for(Student stu:studentArray) {
					tree_set.add(stu);
				}
				for(Student stu:tree_set) {
					System.out.println("Name:"+stu.getName());
					System.out.println("Age:"+stu.getAge());
				}
				break;
				
			case 8:
				System.exit(0);
				
			default:
				System.out.println("Invaild Choice!! Please make a valid choice.\\n\\n");
				
			
			}
		}
		

	}

}
