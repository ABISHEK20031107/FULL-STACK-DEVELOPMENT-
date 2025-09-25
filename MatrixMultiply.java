package ArrayMatrix;

public class MatrixMultiply {


public static void main(String[] args) {
			//Creating two Matrices
			int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
			int b[][]= {{4,5,7},{8,9,10},{5,3,4}};
			

			int c[][]=new int[3][3];
			//adding and printing the addition of 2 matrices
			for (int i=0;i<3;i++)//row 
				{
				
				for (int j=0;j<3;j++)//column

				{
					c[i][j]=0;
					for(int k=0;k<3;k++) {
						
						
					
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}//addition or sub
					System.out.print(c[i][j]+" ");
				}
			System.out.println();
			
		}}
}
