/*
* Program : A method which accepts char array and returns number of vowels.
* Author  : Aman Kumar
* Date    : 14th july 2014
*/
class Vowels{

public static int CountVowels(char[] array){

char[] target=array;
int total=0;
for(int i=0;i<target.length;i++){

    if((array[i]=='a')||(array[i]=='e')||(array[i]=='i')||(array[i]=='o')||(array[i]=='u')){
	total+=1;
	}
   }return total;
 }
}
