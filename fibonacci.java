class fibonacci
{
public static void main(String[] arg)
{
int num1 = 0;
int num2 = 1;
System.out.println("The Fibonacci Series as follow ::");
for (int i = 0;i<10;i++){
System.out.println(num1);

num1 = num1+num2;
num2 = num1-num2;
}
}
}