package Task;

public class IncreaseBy3 {

	public static void main(String[] args) {

		int num=12;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(num +" ");
				num+=3;
				
			}
			System.out.println();
		}
	}

}
