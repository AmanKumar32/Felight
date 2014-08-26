/*
 * Program : A program which provide rating from reviews context.
 * Author  : Aman Kumar
 * Date    : 28th July 2014 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReviewsRating {

	int count = 0;

	public int findRating(String filename) throws FileNotFoundException {

		String[] goodReviews = { "good", "very good", "nice", "amazing",
				"beautiful", "awesome" };
		String[] badReviews = { "bad", "very bad", "totally waste", "worst",
				"ugly"};
		FileReader fileReader = new FileReader(filename);
		BufferedReader buffer = new BufferedReader(fileReader);
		String line = null;
		
		try {
			while ((line = buffer.readLine()) != null) {
				for (String str:goodReviews) {
						
					if (line.contains(str)) {
						count++;
					
					}
				}
				for(String str2:badReviews){
					
					if(line.contains(str2)){
						count--;
					}
				}
					
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;

	}
}
