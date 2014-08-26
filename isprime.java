class isprime
{
public static void main(String[] arg)
{
System.out.println(find(50));
System.out.println(find(6));
System.out.println(find(37));
System.out.println(find(3));
}
public static boolean find(int num)
{
if ((num%num==0)&&(num%2==0)){
System.out.println("This number is not prime :: "+num);
return false;
}else{
System.out.println("This number is prime "+num);
return true;
}
}
}
