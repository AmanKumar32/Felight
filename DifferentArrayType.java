/*
* Program : Create an array of type boolean,double,int,char
* Author  : Aman Kumar
* Date    : 11th july 2014
*/
class DifferentArrayType
{
public static void main(String[] arg){
BeforeInitialization();
AfterInitialization();
}
public static void BeforeInitialization(){
boolean[] array1= new boolean[5];
double[] array2= new double[5];
int[] array3= new int[5];
char[] array4= new char[5];
System.out.println("The values of differnt array  type Before Initialization = "+ "Boolean= " +array1 + "\nDouble= " +array2+ "\nInteger= " +array3+ "\nCharacter= " +array4);
}
public static void AfterInitialization(){
boolean[] array1= new boolean[] {true,false,true,false,true};
double[] array2= new double[] {30.50,35.33,44.55,66.11,88.22};
int[] array3= new int[] {1,2,3,4,5 };
char[] array4= new char[] {'a','b','c','d','e'};
System.out.println("The values for Boolean After Initialization = ");
for(int b=0;b<array1.length;b++){
System.out.println(array1[b]);
}
System.out.println("The values for Double After Initialization = ");
for(int d=0;d<array2.length;d++){
System.out.println(array2[d]);
}
System.out.println("The values for Integer After Initialization = ");
for(int i=0;i<array3.length;i++){
System.out.println(array3[i]);
}
System.out.println("The values for Character After Initialization = ");
for(int c=0;c<array4.length;c++){
System.out.println(array4[c]);
}
}
}

/*  Output
* The values of differnt array  type Before Initializ
Double= [D@7ad3f189
Integer= [I@7096985e
Character= [C@2eed7d11
The values for Boolean After Initialization =
true
false
true
false
true
The values for Double After Initialization =
30.5
35.33
44.55
66.11
88.22
The values for Integer After Initialization =
1
2
3
4
5
The values for Character After Initialization =
a
b
c
d
e
*/

