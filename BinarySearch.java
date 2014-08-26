/*
* Program : A method  using Binary search and returns the position.
* Author  : Aman Kumar
* Date    : 15th july 2014
*/

class BinarySearch{
public static void main(String[] arg){
int[] array = {1,2,3,4,5,6,7,8,9,10}; 
int position=LinearSearch(array,2); 
System.out.println("Position of the value in Array  = "+position);
}
public static int BinarySearch(int[] num,int value)
{
int[] array= num;	
int Index=0;
int mid=array.length/2;
int key=value;
//for(int i=0;i<array.length;i++){
  if(array[mid]<key){
      mid=;
	}
	else if(array[mid]>key){
	mid;
	}
	else if(array[mid]==key){
	return mid;
	}

 //}
}

//  Output
/*
Position of the value in Array  = 1
*/