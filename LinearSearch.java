/*
* Program : A method  using Linear search and returns the position.
* Author  : Aman Kumar
* Date    : 14th july 2014
*/
class LinearSearch{
public static void main(String[] arg){
int[] array = {1,4,4,2,5,-3,6,2}; 
int position=LinearSearch(array,-2); 
System.out.println("Position of the value in Array  = "+position);
}
public static int LinearSearch(int[] num,int value)
{
int[] array= num;	
int Index=0;
for(int i=0;i<array.length;i++){
  if(array[i]==value)
	{
	return i;
	}
   
	}return -1;
 // return Index;
 }
}

//  Output
/*
Position of the value in Array  = 1
*/