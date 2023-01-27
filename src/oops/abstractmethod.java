package oops;

abstract class Bike{
	abstract void speed();
	void display() {
		System.out.println("Bike class");
	}
}

class MotorBike extends Bike{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Motorbike speed=60kmph");
		
	}
	
}

abstract class SpeedBike extends Bike{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speedbike speed=150kmph");
		
	}
	
}
public class abstractmethod extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractmethod a=new abstractmethod();
		a.display();
		a.speed();
		MotorBike m=new MotorBike();
		m.speed();
	
		
		

	}

	@Override
	void speed() {
		//we cannot create object of abstract class
		System.out.println("Speed=140kmph");
		
	}

}
