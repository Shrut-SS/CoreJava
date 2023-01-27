package basicofjava;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("Cooking ");
		str.append("Emerging ");
		System.out.println(str);
		str.insert(17, "Technology ");
		System.out.println(str);
		str.replace( 8, 16, "IoT");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println( str.capacity() );

	}

}
