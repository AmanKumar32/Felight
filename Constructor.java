/*
* Program : Create a class called Constructor with one data member for every primitive data type and 
            create a object and display the members values with out initializing it to know the default 
			values assigned by constructor .
* Author  : Aman Kumar
* Date    : 16th july 2014
*/

class Constructor{

byte b;
short s;
int i;
long l;
float f;
double d;
char c;
boolean b1;
 
 public static void main(String[] arg){ 
 show obj=new show();
 System.out.println("The Default Values for Various Primitive DataType with Initializing = ");
 System.out.println(+obj.b+"\n "+obj.s+"\n "+obj.i+"\n "+obj.l+"\n "+obj.f+"\n"+obj.d+"\n "+obj.c+"\n "+obj.b1);
 }
}
 