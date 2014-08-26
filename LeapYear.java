public class LeapYear {

public static void main(String[] arg){
find(1700);
}
 
3
    public void find(int year) {
4
        if (year % 100 == 0) {
5
            if (year % 400 == 0) {
6
                System.out.println(year + " is a leap year");
7
            } else {
8
                System.out.println(year + " is not a leap year");
9
            }
10
        } else {
11
            if (year % 4 == 0) {
12
                System.out.println(year + " is a leap year");
13
            } else {
14
                System.out.println(year + " is not a leap year");
15
            }
16
        }
17
    }
18
}
