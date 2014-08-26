package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {

		Employee e = null;
		Employee e2 = null;
		try{
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			e2 = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch(IOException i){
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c){
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee1...");
		System.out.println("Name: "+ e.name);
		System.out.println("Address: "+ e.address);
		System.out.println("SSN: "+ e.SSN);
		System.out.println("Number: "+ e.number);
        
		System.out.println();
        
		System.out.println("Deserialized Employee2...");
		System.out.println("Name: "+ e2.name);
		System.out.println("Address: "+ e2.address);
		System.out.println("SSN: "+ e2.SSN);
		System.out.println("Number: "+ e2.number);
        
	}

}
