class isprimeseries
{
public static void main(String[] arg)
{
find();
}
public static void find()
{
 int front=100,end=200;
 while(front<end){
 if ((front%front==0)&&(front%2==0)){
 System.out.println("This number is not prime :: "+front);

 }else
 {
 System.out.println("This number is prime "+front);
 }front++;
}
}
}
