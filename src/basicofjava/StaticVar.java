package basicofjava;

class Studentnm{
	int rollNo;
	String name;
	static String courseName;
}

public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Studentnm s1=new Studentnm();
        Studentnm s2=new Studentnm();
        Studentnm s3=new Studentnm();
        
        Studentnm.courseName="Java Full Stack";
        
        s1.rollNo=1;
        s1.name="Stud1";
        
        s1.rollNo=2;
        s1.name="Stud2";
        
        s1.rollNo=3;
        s1.name="Stud3";
        
        System.out.println("S1 Roll No.="+s1.rollNo+" S1 Name= "+s1.name+" S1 course Name= "+Studentnm.courseName);
        System.out.println("S2 Roll No.="+s2.rollNo+" S2 Name= "+s2.name+" S2 course Name= "+s2.courseName);
        System.out.println("S3 Roll No.="+s3.rollNo+" S3 Name= "+s3.name+" S3 course Name= "+s3.courseName);
        
        s2.courseName="Python";
        s2.name="ABC";
        System.out.println("After Change");
        System.out.println("S1 Roll No.="+s1.rollNo+" S1 Name= "+s1.name+" S1 course Name= "+s1.courseName);
        System.out.println("S2 Roll No.="+s2.rollNo+" S2 Name= "+s2.name+" S2 course Name= "+s2.courseName);
        System.out.println("S3 Roll No.="+s3.rollNo+" S3 Name= "+s3.name+" S3 course Name= "+s3.courseName);
	} 

}
