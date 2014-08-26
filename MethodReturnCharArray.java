/*
* Program : A method returns char array filled with random characters.
* Author  : Aman Kumar
* Date    : 14th july 2014
*/

class ReturnCharArray
{
public static char[] MethodReturnCharArray(){

char[] array= new char[]; 
   
 for(int i=65,j=0;i>=127;i++,j++) {
   
      System.out.println(i);
	  //array[j]= char(i);
   }
	return array;
 }
}

//  Output
/*



*/