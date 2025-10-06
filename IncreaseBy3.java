package Task;

public class IncreaseBy3 {

	public static void main(String[] args) {

		int num=1;
		
		for(int i=1;i<=9;i++) //ROW
		{
			
			for(int j=1;j<=i;j++)//COLUMN
		{
				
				System.out.print(num +" ");
				num+=1;
				
			}
			
			System.out.println();
		}
	}

}
