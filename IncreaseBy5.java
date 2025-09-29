package Task;

public class IncreaseBy5 {



	public static void main(String[] args) {

		int num=15;
		
		for(int i=1;i<=3;i++) 
		{
			
			for(int j=1;j<=i;j++)
		{
				
				System.out.print(num +" ");
				num+=5;
				
			}
			
			System.out.println();
		}
	}


}
