/*
 * Program : A program which search gmail address from random email address.
 * Author  : Aman Kumar
 * Date    : 28th July 2014 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class GmailSearch {

public static void main(String[] args) 
{
    String sourcePath = "email";
    BufferedReader br;
    String inputSearch = "@gmail.com";
    String line = "";
    String targetPath = "gmail";
    BufferedWriter bw;
    int rating=0;
    try {
        br = new BufferedReader(new FileReader(sourcePath));	 
              try {
            	  bw=new BufferedWriter(new FileWriter(targetPath));
            	  
            	  while((line = br.readLine()) != null)
            {
                String[] words = line.split(" ");
                
                for (String word : words) {
                	if (word.endsWith(inputSearch)) {
                		word.contentEquals(targetPath);
                		rating++;
                		
                		bw.append(line+"\n");
                		
                	}
                }
            
            }System.out.println(rating);
            	  System.out.println("Contents Written To file");	  
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

}
}