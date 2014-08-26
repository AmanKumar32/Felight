/*
* Program : A method accepts length of array and returns random values.
* Author  : Aman Kumar
* Date    : 11th july 2014
*/
class AcceptReturn{
public static void main(String[] arg){
double[] array = new double[5];
 
array= Insert(array);
for(int i=0;i<array.length;i++){
System.out.println(array[i]);
}
}
public static double[] Insert(double[] num)
{
double[] array= num;
for(int i=0;i<array.length;i++){
 array[i]= Math.random()*100;
 
 }
num=array;
 return num;
 }
}

//  Output
/*

*/