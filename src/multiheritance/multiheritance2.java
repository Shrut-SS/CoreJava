package multiheritance;
class AA
{
	void fun1()
	{
		System.out.println("Class A");
	}
}
class BB extends AA
{
	void fun2()
	{
		System.out.println("Class B");
	}
}

class C extends AA
{
	void fun3()
	{
		System.out.println("Class C");
	}
}
class D extends AA
{
	void fun4()
	{
		System.out.println("Class D");
	}
}

public class multiheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b=new BB();
		b.fun2();
		C c=new C();
		c.fun3();
		D d=new D();
		d.fun4();


	}

}
