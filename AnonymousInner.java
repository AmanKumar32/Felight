/*
 *  Program : Example for Anonymous class 
 * 	Author  : Aman Kumar
 *  Date    : 5th aug 2014
 * 
 */


abstract class Dad{
	abstract void doSomething();
}


public class AnonymousInner {

	public static void main(String[] args) {
			
		Dad obj = new Dad() {
			void doSomething(){
				System.out.println("Son  will make Dad proud");
			}
			
		};
		obj.doSomething();
		
	}

}
