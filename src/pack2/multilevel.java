package pack2;

class car{
	public car()
	{
		System.out.println("Class Car");
	}
	public void vehicleType() {
		System.out.println("Vehicle Type:Four Wheeler(car)");
	}
	
}

class Maruti extends car{
	public Maruti() {
		System.out.println("Class Maruti");
	}
	void brand()
	{
		System.out.println("Band:Maruti Suzuki");
	}
	void speed() {
		System.out.println("Max:90kmph");
	}
}

class Maruti800 extends Maruti{
	public Maruti800() {
		System.out.println("Maruti Model:800");
	}
	public void speed() {
		System.out.println("Max: 80kmph");
	}
}
public class multilevel {
      public static void main(String args[]) {
    	  Maruti800 obj = new Maruti800();
    	  obj.vehicleType();
    	  obj.brand();
    	  obj.speed();
      }
}