package home.mytests.test;

public class TwoDArrayRotation {
	
	private static int[][] trasposeMatrix(int[][] matrix)
	{
	    int m = matrix.length;
	    int n = matrix[0].length;

	    int[][] trasposedMatrix = new int[n][m];

	    for(int x = 0; x < n; x++)
	    {
	        for(int y = 0; y < m; y++)
	        {
	            trasposedMatrix[x][y] = matrix[y][x];
	        }
	    }

	    return trasposedMatrix;
	}
	
	private static void reverseEachColumn(int[][] matrix){
		
		
	}
	
	public static void main (String[] args) {
		
		 int[][] matrix = new int[4][4];
		 for (int i=0; i<matrix.length; ++i){
			 for (int j=0; j<matrix[0].length; ++j){
				 matrix[i][j] = i+j+(int) (Math.random() * 100);
			 }
		 }
		 
		System.out.println("Real Matrix"); 
		printArray(matrix); 
		System.out.println("Transposed Matrix");
		
		//to rotate -90 degress
		reverseEachColumn(trasposeMatrix(TwoDArrayRotation.trasposeMatrix(matrix)));
		
		//printArray( TwoDArrayRotation.trasposeMatrix(matrix));
		
	
	}
	
	static void printArray(int[][] matrix){
		
		 for (int i=0; i<matrix.length; ++i){
			 for (int j=0; j<matrix[0].length; ++j){
				System.out.print(" "+matrix[i][j]+" ");
			 }
			 System.out.println("\n");
		 }
	}

}
