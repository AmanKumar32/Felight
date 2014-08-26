class evenmethod
{
public static void main(String[] arg)
{
findeven(50,100);
}
public static void findeven(int from,int to)
{
while(from<to)
{
if(from%2==0)
System.out.println("Number is even = "+from);
from++;
}
}
}