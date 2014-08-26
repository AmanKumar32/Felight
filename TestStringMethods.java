
public class TestStringMethods {

	public static void main(String[] args) {
		
		// Append Method
		System.out.println("Append Method in Strings");
		StringBuffer obj = new StringBuffer("String = "+"I dont get it");
		obj.append("\nLong = "+1258963147);
		obj.append("\nboolean = "+true);
		obj.append("\ncharacter = "+'c');
		obj.append("\nInteger = "+10);
		System.out.println(obj);
		
		// Reverse Method
		System.out.println("=======================");
		System.out.println("Reverse Method in Strings");
		StringBuffer obj2 =  new StringBuffer("String = "+"I dont get it");
		obj2.reverse();
		System.out.println(obj2);

		// Delete Method
		System.out.println("=======================");
		System.out.println("Delete Method in Strings");
		StringBuffer obj3 =  new StringBuffer("I dont get it");
		obj3.delete(2,6);
		System.out.println(obj3);

		// Insert Method
		System.out.println("=======================");
		System.out.println("Insert Method in Strings");
		StringBuffer obj4 =  new StringBuffer("I dont get it");
		obj4.insert(2, "say ");
		System.out.println(obj4);

		// Replace Method
		System.out.println("=======================");
		System.out.println("Replace Method in Strings");
		StringBuffer obj5 =  new StringBuffer("I dont get it");
		obj5.replace(2, 6, "now");
		System.out.println(obj5);

		
	}

}
