package Array;

public class JaggedArrayOrRackedAray {

	public static void main(String[] args) {

		System.out.println("Enter the number of Arrays :");
	
		int [][] jag=new int [3][] ;
		
		
		jag[0]=new int[] {1,2,3};
		
		jag [1]=new int [] {4,5};
		
		jag [2]=new int [] {6,7,8,9};
		
		for (int i=0;i<jag.length;i++) {

			for (int j=0;j<jag[i].length;j++) {
				
				System.out.print(jag[i][j]+" ");
				
				System.out.println();
			}
		}
	}

}
