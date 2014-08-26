package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
			Employee  e = new Employee();
			Employee e2 = new Employee();
			e.name = "Aman Kumar";
			e.address = "Atiguppe Metro Station";
			e.SSN = 47896785;
			e.number = 897198;
			e2.name = "Venkat sai";
			e2.address = "Btm Layout";
			e2.SSN = 25852;
			e2.number = 852;
			try {
				FileOutputStream fileOut = new FileOutputStream("employee.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(e);
				out.writeObject(e2);
				out.close();
				fileOut.close(); 
			}catch(IOException i){
				i.printStackTrace();
			}
		
	}

}
