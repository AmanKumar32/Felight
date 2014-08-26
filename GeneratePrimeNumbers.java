 class GeneratePrimeNumbers {
 
        public static void main(String[] args) {
             findprime(100);  
        } 
              public static void findprime(int limit){
		
                System.out.println("Prime numbers between 1 and " + limit);
               
                for(int i=1; i < 100; i++){
                       
                  boolean isPrime = true;
                       
                for(int j=2; j < i ; j++){
                               
                     if(i % j == 0){
                     isPrime = false;
                       break;
                  }
             }
             if(isPrime)
         System.out.print(i + " ");
        }
		}
}
