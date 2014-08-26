/*
* Program : A method which accepts from and to and return an array filled with prime number.
* Author  : Aman Kumar
* Date    : 14th july 2014
*/
 class GeneratePrimeNumbersArray {
 
        public static void main(String[] args) {
             int[] array=findprime(100,200);
				for(int num:array){
				System.out.println(num);
				}
        } 
              public static int[] findprime(int from,int to){
		
                System.out.println("Prime numbers between "+from+" and " + to);
               int[] array=new int[to];
				int k=0;
		  for(int i=from; i <array.length; i++){
                       
                  boolean isPrime = true;
                       
                for(int j=from+1; j < i ; j++){
                               
                     if(i % j == 0){
                     isPrime = false;
                       break;
                  }
             }
             if(isPrime)
         array[k]=i;
		 k++;
		 //System.out.print(i + " ");
        
		}return array;
	}
}
