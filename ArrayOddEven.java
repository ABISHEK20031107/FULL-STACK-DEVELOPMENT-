package Array;
import java.util.Scanner;
public class ArrayOddEven {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int arr = sc.nextInt();

		        int [] numbers = new int[arr];

		        System.out.println("Enter " + arr + " numbers:");
		        for (int i = 0; i < arr; i++) {
		            numbers[i] = sc.nextInt();
		        }

		        System.out.println("Odd or Even results:");
		        for (int i = 0; i < arr; i++) {
		            if (numbers[i] % 2 == 0) {
		                System.out.println(numbers[i] + " is Even");
		            } else {
		                System.out.println(numbers[i] + " is Odd");
		            }
		        }

		        sc.close();
		    }
		}
