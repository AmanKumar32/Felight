/*
*   Program : Write a method which accepts a string as argument and returns 
			  the first letter of every word clubbed into a string.
* 	Author  : Aman Kumar
*	Date    : 24th July 2014
*/
class ReturnFirstLetter {
		
		public char[] searchFirst(String Source){
			char[] chrArray2= new char[Source.length()];
			char[] chrArray1=Source.toCharArray();
				chrArray2[0]=chrArray1[0];
			int j=1;
		for(int i=1;i<Source.length()-1;i++){
			
			if(chrArray1[i]==(int)32){
					System.out.println(chrArray1[i]);
					chrArray2[j]=chrArray1[i+1];
					j++;
				}
			
		}return chrArray2;
		
	}
}