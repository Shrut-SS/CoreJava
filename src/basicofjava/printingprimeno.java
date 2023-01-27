package basicofjava;

public class printingprimeno {

	public static void main(String[] args) {

	        int i, j, isPrime, n;
	        System.out.println("All Prime Numbers Between 1 to 50");
	 
	        for (i = 2; i <= 50; i++) {
	            isPrime = 0;
	            // Check whether i is prime or not
	            for (j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    isPrime = 1;
	                    break;
	                }
	            }
	 
	            if (isPrime == 0)
	                System.out.print(i + " ");
	        }

	}

}
