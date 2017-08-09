package raws;

import java.io.*;
import java.util.*;

public class SearchEngine {
	public static String searched_word ; // the words what to be searched
	
	public static void readData() throws Exception{
			try{
				Scanner input = new Scanner(new File("C:\\Users\\Yeasin\\workspace\\Titus\\Directories.txt")); 
				
				while(input.hasNext()){
					 /// Start fixing from here
					
					String line = input.nextLine();
					System.out.println(line);
					
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
	}		

}
