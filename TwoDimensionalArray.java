/*
* Program : A Program for Two Dimensional Array  .
* Author  : Aman Kumar
* Date    : 15th july 2014
*/

class TwoDimensionalArray{
public static void main(String[] arg){

int[][] array={{2,3},{4,2},{3,9},{8,7}};
int i,j;
// Print elements in row i
   	 for ( i = 0 ; i < array.length ; i++ )
   	 {
    
   	    // Print column j in row i
   	    for ( j = 0 ; j < array[i].length ; j++ )
   	    {
		
   	       System.out.print( array[i][j] + "   " );
   	    }
		System.out.println();
    	}
 } 
}