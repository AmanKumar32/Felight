/*
* Program : A method  using SelectionSort .
* Author  : Aman Kumar
* Date    : 15th july 2014
*/

class SelectionSort{
  public static void main(String[] arg){
  
 int[] array = {5,2,6,3,4,1}; 
 int[] Sorted=SelectionSearch(array); 
 for(int num:Sorted){
    System.out.println(num);
    }
  }
 public static int[] SelectionSearch(int[] source){
    int[] target=source;
	int length=target.length;
	int temp=0;
	for(int i=0;i<length-1;i++){
		for(int j=i+1;j<length;j++){
		
	   if(target[i]>target[j]){
	      temp=target[i];
		  target[i]=target[j];
		  target[j]=temp;
		 }  
	   }
	}return target;
  }
 }