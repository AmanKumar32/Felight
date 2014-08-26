/*
* Program : Compute Two different Statements
* Author  : Aman Kumar
* Date    : 11th july 2014
*/
class Compute
{
public static void main(String[] arg)
{
//computing first area
float radius1=1.0f;double area1=radius1 * radius1 * 3.14159;
System.out.println("The area is  " + area1 + " for radius " + radius1);
//computing second area
float radius2= 2.0f;
double area2 = radius2 * radius2 * 3.14159;
System.out.println("The area is  " + area2 + " for radius " + radius2);
}
}

//  Output
/*
The area is  3.14159 for radius 1.0
The area is  12.56636 for radius 2.0
*/