/*
* Program : Write a method which accepts variable number of argument of type double and returns sum of all the elements.
* Author  : Aman Kumar
* Date    : 14th july 2014
*/
class VariableLength{
public static double VariableArgumentSum(double... source){
double[] target =source;
double total=0;
for(int i=0;i<target.length;i++){
   total+=target[i];
   }
   return total;
 }
 
}