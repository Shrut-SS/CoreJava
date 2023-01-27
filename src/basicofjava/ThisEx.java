package basicofjava;

public class ThisEx {
	
	int a,b;
	ThisEx(int a,int b){
		this.a=a;
		this.b=b;
	}
	ThisEx(int a){
		this(a,a);
	}
	ThisEx(){
		this(0);
	}
	@Override
	public String toString() {
		return "ThisEx [a=" + a + ", b=" + b + "]";
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEx t1=new ThisEx();
		ThisEx t2=new ThisEx(34);
		ThisEx t3=new ThisEx(2,3);
		System.out.println("t1:"+t1);
		System.out.println("t2:"+t2);
		System.out.println("t3:"+t3);
	}


}
