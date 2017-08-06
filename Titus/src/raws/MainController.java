package raws;

import java.io.File;
import java.util.ArrayList;

public class MainController {
	public static void main(String[] args) throws Exception {

		SearchPage sp = new SearchPage();
		sp.runUI();
		// Calling the object .. creating a file using constructor
		fileLists fl = new fileLists();

		// File listing available to the drive
		File[] rootDir; // for saving all the directories
		rootDir = File.listRoots();

		ArrayList<File> allList = new ArrayList<>(); // All the root directories
														// will be stored in
														// array list
//		if(fl.fileOk)
		{
			for (File path : rootDir) {
//				System.out.println("----Drive " + path.getName());
				fl.listf(path.getAbsolutePath(), allList);
			
			}
		}
	
		System.out.println("Searching complete");
//		 sp.textField_2.setText("Scanning complete");
//		 sp.close();
	}

}
