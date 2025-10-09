package Task;

public class PrimeFloydTriangle {

    // Function to check if a number is prime
    static boolean isPrime(int num)
    {
        if (num < 2) 
        	return false;
        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) 
            	return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
    	int n=2;
        int rows = 5; // fixed number of rows (you can change this)
        int num = 2;  // starting number (first prime)

        for (int i = 1; i <= rows; i++) 
        
        {        // row loop
            for (int j = 1; j <= i; j++)
            {       // column loop
                // find next prime
                while (!isPrime(num)) {
                    num++;
                }
                System.out.print(num+" " );
                num++;
            }
            System.out.println();
        }
    }
}

