import java.io.FileNotFoundException;




public class Test {

	public static void main(String[] args) {

		String filename= "reviews";
		
		
		ReviewsRating obj = new ReviewsRating();
		int rating=0;
		try {
			rating = obj.findRating(filename);
			System.out.println(rating+"/5");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
