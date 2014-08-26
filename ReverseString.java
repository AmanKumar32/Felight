/*
*   Program :  Write a method to reverse a string without using StringBuffer or StringBuilder.
* 	Author  : Aman Kumar
*	Date    : 24th July 2014
*/
class ReverseString {

		public char[] reverse(String Source){
			char[] chrArray2= new char[Source.length()];
			char[] chrArray1=Source.toCharArray();
			int lengthString =Source.length();
			System.out.println(lengthString);
			int j=lengthString-1;
		for(int i=0;i<Source.length();i++,j--){
			
				chrArray2[j]=chrArray1[i];
			
		}return chrArray2;

	}
}