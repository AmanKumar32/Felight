import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadReviews {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String fileName = "reviews";
		String line = null;
		
		FileReader fileReader;
		try {
			fileReader = new FileReader(fileName);
			BufferedReader obj = new BufferedReader(fileReader);
			
				while ((line = obj.readLine())!= null)  {
					
					}
				obj.close();
			
			}
			catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			}
				
	}

	}

