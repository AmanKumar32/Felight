/*
* Program : A Program for Ragged Array  .
* Author  : Aman Kumar
* Date    : 15th july 2014
*/

class RaggedArray{
public static void main(String[] arg){

int[][] array={
{1,2,3,4,5},
{2,3,4,5},
{3,4,5},
{4,5},
{5}
};
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