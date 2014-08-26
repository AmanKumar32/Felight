/*
 * Program : An Example to Read Input from Console.
 * Author  : Aman Kumar
 * Date    : 30th July 2014 
 */


package consoleInput;

import java.util.Scanner;

public class ReadingConsoleInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name = ");
		String str = scan.nextLine();
		System.out.println(str);
		scan.close();
	

	}

}
