/*
* Program : A Program for Array class .
* Author  : Aman Kumar
* Date    : 15th july 2014
*/
import java.util.Arrays.*;

class ArrayClass{

public static void main(String[] arg){

int[] list={2,4,7,10,11,45,52};
System.out.println("(1) Index is " +java.util.Arrays.binarySearch(list,11));
System.out.println("(2) Index is " +java.util.Arrays.binarySearch(list,45));

int[] list1={2,4,7,10};
int[] list2={2,4,7,10};
int[] list3={4,2,7,10};
System.out.println(java.util.Arrays.equals(list1,list2));
System.out.println(java.util.Arrays.equals(list2,list3));	
	
	
	}
 }
