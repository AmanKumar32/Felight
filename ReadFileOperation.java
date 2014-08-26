import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFileOperation {

	public static void main(String[] args) {

		String fileName = "VenkatPrakash";
		String line = null;
		
		FileReader fileReader;
		try {
			fileReader = new FileReader(fileName);
			BufferedReader obj = new BufferedReader(fileReader);
			
			try {
				while ((line = obj.readLine())!= null)  {
						System.out.println(line);
					}
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
			catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				
	}

}
