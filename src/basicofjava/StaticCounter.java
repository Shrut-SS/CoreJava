package basicofjava;

public class StaticCounter {
    int a;//a=1;
    static int b;//b=1;
    public StaticCounter() {
    	a++;//a=a++;
    	b++;//b=b++;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCounter sc1=new StaticCounter();
		StaticCounter sc2=new StaticCounter();
		StaticCounter sc3=new StaticCounter();
		StaticCounter sc4=new StaticCounter();
		StaticCounter sc5=new StaticCounter();
		
		System.out.println(sc1.a);
		System.out.println(sc3.a);
		System.out.println("static");
		System.out.println(StaticCounter.b);
//		System.out.println(sc3.b);
		

	}

}
