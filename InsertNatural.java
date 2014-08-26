/*
* Program : Fill array with Natural numbers
* Author  : Aman Kumar
* Date    : 11th july 2014
*/
class InsertNatural{
public static void main(String[] arg){
int[] array = {1,0,2,3,5,8};
Insert(array);
}
public static void Insert(int[] num)
{
int[] array= num;
for(int i=0;i<array.length;i++){
 if(array[i]==0){
 System.out.println("Invaild Natural Number");
 break;}
 array=num;
System.out.println(array[i]);
 }
}
}

//  Output
/*
1
Invaild Natural Number
*/