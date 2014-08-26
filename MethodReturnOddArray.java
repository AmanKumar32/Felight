/*
* Program : A method which accepts from and to and return an array filled with odd number.
* Author  : Aman Kumar
* Date    : 15th july 2014
*/

class MethodReturnOddArray
{
public static void main(String[] arg)
{
int[] array2=findodd(0,10);
for(int print:array2){
  System.out.println(print);
 }
}
public static int[] findodd(int from,int to){

//int length=to-from;
int length=to/2;
   int j=0;
   int[] array = new int[length];
 for(int i=from;i<=to;i++) {
   	
      if(i%2!=0){  
			if(i>0){
			array[j]=i;
			j++; 
			}
		}
     
   }
	return array;
 }
}

//  Output
/*
2
4
6
8
10


*/