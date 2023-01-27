package basicofjava;

public class thiskeyword {

	String name;
//	int num;
//	
//
//	public thiskeyword(String name, int num) {
////		super();
//		this.name = name;
//		this.num = num;
//	}
//
//	public thiskeyword(String name) {
////		super();
//		this(name,num);
//		this.name = name;
//		System.out.println("Name is :"+this);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void  main(String args[]) {
		thiskeyword t=new thiskeyword();
		t.setName("Shruti");
		System.out.println("Object t:"+t.getName());
		
	}

	
}
