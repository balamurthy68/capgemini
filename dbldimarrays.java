package utils;

public class dbldimarrays {
	public static void main(String[] args) {
	//creating two matrices    
    int a[][]={{8,5,1},{9,3,2},{4,6,3}};    
    int b[][]={{8,5,3},{9,5,7},{9,4,1}};    
    int k []= {1,2,3};
    
    //matrix to store the sum of two matrices    
    int c[][]=new int[3][3];  //3 rows and 3 columns  
    
    //adding 2 matrices 
    
    for(int row=0;row<3;row++){    
      for(int col=0;col<3;col++){    
        c[row][col]=a[row][col]+b[row][col];
        System.out.print(c[row][col]+" ");    
      }
      System.out.print("\n"); 
    }    
}
}
