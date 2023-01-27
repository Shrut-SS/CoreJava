package basicofjava;

public class logical_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=20,b=10;
        System.out.println(a==b && a<b);       	
        System.out.println(a==b || a>b);
        
        //ternary operator
        
        int n=10;
        String res;
        res=(n%2)==0?"even":"odd";
        System.out.println(res);
        
        int n1=10;
        int n2=20;
        String result=(n1>n2)?"n1 is greater":"n2 is greator";
        System.out.println(result);
        
        //voter Q
        int age=20;
//        int n2=20;
        String valid=(age>=18)?"Voter is valid":"Voter is not valid";
        System.out.println(valid);
        
        //three number comparison
        int a1=10;
        int b1=20;
        int c1=30;
        
        String greater=(a1>b1 && a1>c1)?"a1 is greater":(b1>a1 && b1>c1)?"b1 is greater":"c1 is greater";
        System.out.println(greater);
        
        //assignment operator
        int a2=5,b2=6;
        System.out.println(a2+=b2);
        System.out.println(a2-=b2);
        System.out.println(a2*=b2);
        System.out.println(a2+=b2);
        System.out.println(a2/=b2);
        System.out.println(a2^=b2);
        System.out.println(a2%=b2);
     
        
        

	}

}
