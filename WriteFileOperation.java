
import java.io.FileWriter;
import java.io.IOException;


public class WriteFileOperation {

	public static void main(String[] args) {

		String fileName = "VenkatPrakash";
		FileWriter obj;
		try {
			obj = new FileWriter(fileName);
			obj.write("soon");
			obj.write("good");
			obj.write("very good");
			
			obj.close();

		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
