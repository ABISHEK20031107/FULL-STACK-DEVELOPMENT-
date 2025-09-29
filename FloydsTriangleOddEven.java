package Task;

public class FloydsTriangleOddEven {
    public static void main(String[] args) {
        int rows = 5;  // fixed number of rows

        int odd = 1;   
        int even = 2;  

        for (int i = 1; i <= rows; i++) {  
            for (int j = 1; j <= i; j++) { 
                if (i % 2 == 1) { 
                	
                    System.out.print(odd + " ");
                    odd += 2;
                } else {        
                	System.out.print(even + " ");
                    even += 2;
                }
            }
            System.out.println();
        }
    }
}
