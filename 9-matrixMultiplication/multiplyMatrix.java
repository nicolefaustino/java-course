public class multiplyMatrix{
	public static void main(String [] args){
		int [][] matrixA = {{1,2,3},
					  {4,5,6},
					  {7,8,9}};

		int [][] matrixB = {{1,2,3}, 
					  {4,5,6}, 
					  {7,8,9}};

		int [][] matrixC = new int[3][3];

		System.out.println("Matrix A");
		for(int y=0; y< matrixA.length; y++){
			for(int x=0; x< matrixA[y].length; x++){
				System.out.print(matrixA[y][x] + "\t");		
			}
			System.out.println();
		}

		System.out.println("x");

		System.out.println("Matrix B");
		for(int y=0; y< matrixB.length; y++){
			for(int x=0; x< matrixB[y].length; x++){
				System.out.print(matrixB[y][x] + "\t");		
			}
			System.out.println();
		}

		System.out.println("=");

		//Assign the sum to matrix C

		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		matrixC[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];      
		}//end of k loop  
		System.out.print(matrixC[i][j]+" ");  //printing matrix element  
		}//end of j loop  
		System.out.println();//new line 
		}

	}
}