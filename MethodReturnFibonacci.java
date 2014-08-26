/*
* Program : A method returns Fibonacci series..
* Author  : Aman Kumar
* Date    : 14th july 2014
*/
class Return{
public static int[] MethodReturnFibonacci( )
{
int num1 = 0;
int num2 = 1;
int[] array=new int[10];
System.out.println("The Fibonacci Series as follow ::");
for (int i = 0;i<10;i++){
array[i]=num1;

num1 = num1+num2;
num2 = num1-num2;
 }
return array;
 }
}